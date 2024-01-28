/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/**/*.html",
    "./src/**/*.vue",
    "./src/**/*.jsx",
    // Add other file paths as needed
  ],
  theme: {
    extend: {},
  },
  plugins: [],
  purge: {
    enabled: true,
  },
};
