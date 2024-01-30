<template>
  <div>
    <nav class="bg-blue-900 p-4">
      <div
        class="container mx-auto flex flex-col md:flex-row justify-between items-center"
      >
        <!-- Hamburger Icon for Mobile (top right) -->
        <button
          @click="toggleMobileMenu"
          class="text-white block md:hidden self-end"
        >
          <svg
            class="h-6 w-6 fill-current"
            xmlns="http://www.w3.org/2000/svg"
            viewBox="0 0 24 24"
          >
            <path d="M0 0h24v24H0z" fill="none" />
            <path d="M4 6h16v2H4zm0 5h16v2H4zm0 5h16v2H4z" />
          </svg>
        </button>

        <img
          src="../public/marketfinds.png"
          alt="Market Finds Logo"
          class="w-20 mb-4 sm:mb-0"
        />

        <!-- Navigation Links (visible on desktop and mobile) -->
        <div class="md:flex space-x-4 items-center">
          <router-link to="/" class="text-white">Home</router-link>
          <router-link to="/products" class="text-white">Shop</router-link>
          <router-link to="/categories" class="text-white"
            >Categories</router-link
          >
          <router-link to="/cart" class="text-white">Cart</router-link>
          <router-link to="/about" class="text-white">About</router-link>
        </div>

        <!-- Search Bar (visible on desktop) -->
        <div class="relative flex items-center mb-4 md:mb-0">
          <input
            type="text"
            placeholder="Search Market Finds..."
            class="border rounded-full px-4 py-2 focus:outline-none focus:shadow-outline w-full"
          />
          <button class="absolute right-0 rounded-full p-2 bg-white text-white">
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
          </button>
        </div>

        <!-- Login/Logout (visible on desktop) -->
        <div v-if="!loggedIn" class="hidden md:block p-2">
          <router-link to="/login" class="text-white">Log In</router-link>
        </div>
        <button v-if="loggedIn" @click="logout" class="text-white">
          Log Out
        </button>
      </div>
    </nav>

    <!-- Use your custom modal component -->
    <BaseModal :modalActive="mobileMenuActive" @close-modal="closeMobileMenu">
      <!-- Content for the modal goes here -->
      <!-- <h1>This is the mobile menu</h1> -->
      <!-- Log In (visible only on mobile) -->
      <div v-if="!loggedIn" class="text-black mb-2">
        <router-link to="/login">Log In</router-link>
      </div>
      <!-- Logout (visible only on mobile) -->
      <div v-if="loggedIn" class="flex items-center justify-center p-2">
        <button @click="logout" class="text-white">Log Out</button>
      </div>
    </BaseModal>

    <router-view />
  </div>
</template>

<script>
// Import your custom modal component
import BaseModal from "./components/BaseModal";

export default {
  components: {
    BaseModal,
  },
  data() {
    return {
      loggedIn: false,
      mobileMenuActive: false,
    };
  },
  methods: {
    // ... (existing methods)

    // Toggle Mobile Menu
    toggleMobileMenu() {
      this.mobileMenuActive = !this.mobileMenuActive;
    },

    // Close Mobile Menu
    closeMobileMenu() {
      this.mobileMenuActive = false;
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
  padding: 1.5rem; /* Adjusted for better responsiveness */
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
