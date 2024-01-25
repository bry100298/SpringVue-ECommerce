<!-- Front End Setup Guide -->

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

<h2>Troubleshooting</h2>

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

<p>Make sure to adjust these settings based on your project structure.</p>
