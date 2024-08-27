let lock = document.getElementById("lock");
let userpass = document.getElementById("userpass");
let new_userpass = document.getElementById("new_userpass");
let newuserId = document.getElementById("new_username");
let confirm_pass = document.getElementById("confirm_pass");
let lock2 = document.getElementById("lock2");
let lock3 = document.getElementById("lock3");
let username = document.getElementById("username");
let register = document.getElementById("register");
let signup = document.getElementById("signup");
let login = document.getElementById("login");
let data2 = document.getElementById("data2");

// Set initial password types
userpass.type = "password";
new_userpass.type = "password";
confirm_pass.type = "password";
lock.innerHTML = '<i class="fa-solid fa-lock"></i>';
lock2.innerHTML = '<i class="fa-solid fa-lock"></i>';
lock3.innerHTML = '<i class="fa-solid fa-lock"></i>';

function togglePasswordVisibility(lockElement, passwordElement) {
    lockElement.addEventListener("click", () => {
        if (lockElement.innerHTML === '<i class="fa-solid fa-lock"></i>') {
            lockElement.innerHTML = '<i class="fa-solid fa-lock-open"></i>';
            passwordElement.setAttribute("type", "text");
        } else {
            lockElement.innerHTML = '<i class="fa-solid fa-lock"></i>';
            passwordElement.setAttribute("type", "password");
        }
    });
}

// Toggle password visibility for all fields
togglePasswordVisibility(lock, userpass);
togglePasswordVisibility(lock2, new_userpass);
togglePasswordVisibility(lock3, confirm_pass);

// Register button click event
register.addEventListener("click", () => {
    login.style.transform = "translateY(-414px)";
    signup.style.transform = "translateY(-414px)";
    login.style.transition = "transform 1s linear";
    signup.style.transition = "transform 1s linear";
});

// Go to login button click event
document.getElementById("goto_log").addEventListener("click", () => {
    login.style.transform = "translateY(20px)";
    signup.style.transform = "translateY(20px)";
    login.style.transition = "transform 1s linear";
    signup.style.transition = "transform 1s linear";
});

// Confirm password validation
confirm_pass.addEventListener("input", () => {
    let value1 = confirm_pass.value;
    let value2 = new_userpass.value;

    if (value1 === value2) {
        data2.style.border = "2px solid green";
    } else if (value1 === "") {
        data2.style.border = "2px solid black";
    } else {
        data2.style.border = "2px solid red";
    }
});

// Event listener for signup form submission
document.getElementById("signup_btn").addEventListener("click", (e) => {
    e.preventDefault(); // Prevent default form submission

    let userID = newuserId.value;
    let signNewPW = new_userpass.value;
    let signConfirmPW = confirm_pass.value;
    let email = document.getElementById("email").value;

    if (signNewPW === signConfirmPW) {
        let userdata = JSON.parse(localStorage.getItem("userData")) || [];
        userdata.push({ userId: userID, userPW: signNewPW, emailId: email });
        localStorage.setItem("userData", JSON.stringify(userdata));

        // Clear fields after registration
        newuserId.value = "";
        new_userpass.value = "";
        confirm_pass.value = "";
        document.getElementById("email").value = "";
    } else {
        alert("Password mismatch");
        newuserId.value = "";
        new_userpass.value = "";
        confirm_pass.value = "";
        document.getElementById("email").value = "";
    }
});

// Event listener for login form submission
document.getElementById("login_btn").addEventListener("click", (e) => {
    e.preventDefault(); // Prevent default form submission

    let loginUserID = username.value;
    let password2 = userpass.value;
    let file = document.getElementById("img");
    let New_User_Photo = file.files[0];

    // Check if a file was selected
    if (!New_User_Photo) {
        alert("Please select a file.");
        return;
    }

    const reader = new FileReader();

    reader.onload = function (e) {
        const img = new Image();
        img.src = e.target.result;

        img.onload = function () {
            const canvas = document.createElement('canvas');
            const ctx = canvas.getContext('2d');
            const maxSize = 500;

            let width = img.width;
            let height = img.height;

            // Resize logic
            if (width > height) {
                if (width > maxSize) {
                    height *= maxSize / width;
                    width = maxSize;
                }
            } else {
                if (height > maxSize) {
                    width *= maxSize / height;
                    height = maxSize;
                }
            }

            canvas.width = width;
            canvas.height = height;

            ctx.drawImage(img, 0, 0, width, height);
            const resizedImage = canvas.toDataURL('image/jpeg', 0.7);

            // Store user data if login is successful
            let storeUserData = JSON.parse(localStorage.getItem("userData")) || [];
            let user = storeUserData.find(user => user.userId === loginUserID && user.userPW === password2);

            if (user) {
                // Only store login user data if the login is successful
                let loginUserData = [];
                loginUserData.push({
                    userId: loginUserID,
                    userPW: password2,
                    email: user.emailId,
                    imge: resizedImage
                });
                localStorage.setItem("loginUserData", JSON.stringify(loginUserData));

                alert("Login successful");
                window.location.assign("mainpage.html");
            } else {
                alert("ID and password mismatched");
            }

            // Clear the file input
            file.value = "";
        };
    };

    reader.readAsDataURL(New_User_Photo);
});

// Handle forgot password
document.getElementById("forgot_pass").addEventListener("click", () => {
    alert("You are trying to change your password. Please enter OK to continue.");
    window.location.assign("forgotpass.html");
});
