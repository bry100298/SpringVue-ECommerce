# Front End Setup Guide

## 1. Install Vue CLI

Make sure you have Vue CLI installed globally:

```bash
npm install -g @vue/cli

Verify the installation:
vue --version

2. Create Vue Project
Create a new Vue project named "ecommerce-client":
vue create ecommerce-client
cd ecommerce-client
Choose the default preset ([Vue 3] babel, eslint) and use npm.

3. Run the Development Server
Navigate to the project folder and run the development server:
cd ecommerce-client
npm run serve
The application will be accessible at:

Local: http://localhost:8080/
Network: http://192.168.100.67:8080/
4. Add Vue Router
If needed, add Vue Router to your project. If facing issues, run the following commands:
# If script execution is blocked, run this command first
Set-ExecutionPolicy -Scope Process -ExecutionPolicy Bypass

# Then add Vue Router
vue add router
Note: Address any uncommitted changes in the repository before proceeding.

5. Initialize Git Repository
Initialize a Git repository for version control:
git init

Troubleshooting
"Parsing error: No babel config file detected"
If you encounter this error when the IDE is not open at the Vue project's root directory, follow these steps:

Access the settings.json file:

Press Ctrl+, or navigate to File > Preferences > Settings.
Type "eslint" in the search bar and find "Edit in settings.json" under Options.
Locate the workingDirectories setting in settings.json:
"eslint.workingDirectories": [
    {"mode": "auto"}
]
Make sure to adjust these settings based on your project structure.

Feel free to customize the content further based on your project's specific requirements or add any additional sections you think would be helpful.
