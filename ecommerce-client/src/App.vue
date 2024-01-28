<template>
  <div>
    <nav class="bg-blue-900 p-4">
      <div class="container mx-auto flex justify-between items-center">
        <!-- Walmart-like Logo -->
        <!-- <img src="https://shorturl.at/rxBM4" alt="Walmart Logo" class="w-20" /> -->
        <img src="../public/marketfinds.png" alt="Market Finds Logo" class="w-20" />

        <!-- Navigation Links -->
        <div class="flex space-x-4 items-center">
          <router-link to="/" class="text-white">Home</router-link>
          <router-link to="/products" class="text-white">Shop</router-link>
          <router-link to="/categories" class="text-white"
            >Categories</router-link
          >
          <router-link to="/cart" class="text-white">Cart</router-link>
          <router-link to="/about" class="text-white">About Us</router-link>
        </div>

        <!-- Search Bar -->
        <div class="relative flex items-center">
          <input
            type="text"
            placeholder="Search Market Finds..."
            class="bg-white text-gray-900 rounded-full px-4 py-2 focus:outline-none focus:shadow-outline"
          />
          <span class="absolute inset-y-0 right-0 flex items-center pr-3">
            <!-- Heroicon for search -->
            <svg
              class="h-5 w-5 fill-black"
              xmlns="http://www.w3.org/2000/svg"
              x="0px"
              y="0px"
              width="30"
              height="30"
              viewBox="0 0 30 30"
            >
              <path
                d="M 13 3 C 7.4889971 3 3 7.4889971 3 13 C 3 18.511003 7.4889971 23 13 23 C 15.396508 23 17.597385 22.148986 19.322266 20.736328 L 25.292969 26.707031 A 1.0001 1.0001 0 1 0 26.707031 25.292969 L 20.736328 19.322266 C 22.148986 17.597385 23 15.396508 23 13 C 23 7.4889971 18.511003 3 13 3 z M 13 5 C 17.430123 5 21 8.5698774 21 13 C 21 17.430123 17.430123 21 13 21 C 8.5698774 21 5 17.430123 5 13 C 5 8.5698774 8.5698774 5 13 5 z"
              ></path>
            </svg>
          </span>
        </div>

        <!-- Login/Logout -->
        <div v-if="!loggedIn" class="text-white">
          <router-link to="/login" class="text-white">Log In</router-link>
        </div>
        <button v-if="loggedIn" @click="logout" class="text-white">
          Sign Out
        </button>
      </div>
    </nav>

    <router-view />
  </div>
</template>

<script>
export default {
  data() {
    return {
      loggedIn: false,
    };
  },
  methods: {
    login() {
      // Your login logic here
      this.loggedIn = true;
    },
    logout() {
      // Your logout logic here
      this.loggedIn = false;
    },
    search() {
      // Your search logic here
    },
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
