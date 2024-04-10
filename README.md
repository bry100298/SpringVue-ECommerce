<!-- Front End Setup Guide -->
<h1>Front End Setup Guide</h1>

<h2>1. Install Vue CLI</h2>

<p>Make sure you have Vue CLI installed globally:</p>

<pre>
  <code>
    npm install -g @vue/cli
    vue --version
  </code>
</pre>

<h2>2. Create Vue Project and Run the Development Server</h2>

<p>Create a new Vue project named "ecommerce-client":</p>

<pre>
  <code>
    vue create ecommerce-client
    cd ecommerce-client
  </code>
</pre>

<p>Choose the default preset ([Vue 3] babel, eslint) and use npm.</p>

<p>Run the development server:</p>

<pre>
  <code>
    npm run serve
  </code>
</pre>

<p>The application will be accessible at:</p>
<ul>
  <li>Local: <a href="http://localhost:8080/">http://localhost:8080/</a></li>
  <li>Network: <a href="http://192.168.100.67:8080/">http://192.168.100.67:8080/</a></li>
</ul>

<h2>3. Add Vue Router</h2>

<p>If needed, add Vue Router to your project. If facing issues, run the following commands:</p>

<pre>
  <code>
    <!-- If script execution is blocked, run this command first -->
    Set-ExecutionPolicy -Scope Process -ExecutionPolicy Bypass

    <!-- Then add Vue Router -->
    vue add router
  </code>
</pre>

<p>Note: Address any uncommitted changes in the repository before proceeding.</p>

<h2>4. Initialize Git Repository</h2>

<p>Initialize a Git repository for version control:</p>

<pre>
  <code>
    git init
  </code>
</pre>

<h2>5. Install and Configure Tailwind CSS</h2>

<p>Install Tailwind CSS and its dependencies:</p>

<pre>
  <code>
    npm install -D tailwindcss postcss autoprefixer
  </code>
</pre>

<p>Create a Tailwind CSS configuration file:</p>

<pre>
  <code>
    npx tailwindcss init -p
  </code>
</pre>

<p>Add the following scripts to your <code>package.json</code>:</p>

<pre>
  <code>
    "scripts": {
      "serve": "vue-cli-service serve",
      "build:css": "postcss src/assets/css/tailwind.css -o src/assets/css/style.css",
      "build": "npm run build:css && vue-cli-service build",
      "lint": "vue-cli-service lint"
    },
    "postcss": {
      "plugins": {
        "tailwindcss": {},
        "autoprefixer": {}
      }
    }
  </code>
</pre>

<p>Rerun npx tailwindcss init -p or manual Add the following scripts to your <code>tailwind.config.js</code>:</p>

<pre>
  <code>
    // tailwind.config.js

    module.exports = {
      // ... other configurations

      purge: {
        enabled: true,
        content: [
          './src/**/*.html',
          './src/**/*.vue',
          './src/**/*.jsx',
          // Add other file paths as needed
        ],
      },
    };
  </code>
</pre>

<p>Create a new CSS file for your styles, for example, in the "src/assets/css/" directory:</p>

<pre>
  <code>
    mkdir -p src/assets/css
    touch src/assets/css/tailwind.css
  </code>
</pre>

<p>Update the <code>tailwind.css</code> file with the following content:</p>

```css
/* src/assets/css/tailwind.css */
@import "tailwindcss/base";
@import "tailwindcss/components";
@import "tailwindcss/utilities";
```

<p>Update the <code>postcss.config.js</code> file:</p>
<pre>
  <code>
    module.exports = {
      plugins: {
        tailwindcss: {},
        autoprefixer: {},
      },
    }
  </code>
</pre>
<p>Update the <code>main.js</code> file to include the Tailwind CSS styles:</p>
<pre>
  <code>
    // src/main.js
    import '@assets/css/tailwind.css'
  </code>
</pre>

<p>Build Tailwind CSS:</p>

<pre>
  <code>
    npm run build:css
    npx tailwindcss build -o dist/style.css
  </code>
</pre>

<p>Now, your styles are applied, and Tailwind CSS is set up!</p>

<p>Make sure to adjust these settings based on your project structure.</p>

<h2>#tbd Troubleshooting</h2>

<p><strong>"Parsing error: No babel config file detected"</strong></p>

<p>If you encounter this error when the IDE is not open at the Vue project's root directory, follow these steps:</p>

<ol>
  <li>Access the <code>settings.json</code> file:</li>
  <ul>
    <li>Press <code>Ctrl+,</code> or navigate to <code>File > Preferences > Settings</code>.</li>
    <li>Type "eslint" in the search bar and find "Edit in settings.json" under Options.</li>
  </ul>
  <li>Locate the <code>workingDirectories</code> setting in <code>settings.json</code>:</li>
</ol>

<pre>
  <code>
    "eslint.workingDirectories": [
      {"mode": "auto"}
    ]
  </code>
</pre>

<p><strong>Caching and Lint</strong></p>

<pre>
  <code>
    npm cache clean --force

    npm run lint -- --fix
  </code>
</pre>

<p><strong>use volar service instead of vetur</strong></p>

<pre>
  <code>
    npm install volar-service-vetur
  </code>
</pre>

<p><strong>Option Icons , still not working</strong></p>

<pre>
  <code>
    npm install tailwindcss-plugin-icons

    npm install vue-feather-icons
  </code>
</pre>


<!-- Back End Setup Guide -->
<h1>Back End Setup Guide</h1>

<h2>1. Install ...</h2>

https://www.educative.io/

1. First, go to https://start.spring.io/ where we can create new spring app and add dependencies
2. Select mavenm, add Spring Data JPA and Spring Web dependencies
   click "Add dependencies" , type "Spring Data JPA" and "Spring Web"
   https://github.com/fabric8-analytics/fabric8-analytics-vscode-extension/blob/master/README.md
3. 

