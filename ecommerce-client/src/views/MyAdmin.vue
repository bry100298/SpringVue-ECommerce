<template>
  <div class="container mx-auto my-8">
    <button
      @click="toggleMarketAdminHub"
      class="bg-blue-500 text-white px-4 py-2 rounded-md mb-4"
    >
      Admin
    </button>

    <!-- Market Admin Hub Aside -->
    <aside v-if="showMarketAdminHub" class="w-1/4 bg-gray-900 text-gray-200">
      <!-- Brand Logo -->
      <a href="#" class="brand-link text-center block py-4">
        <span class="brand-text font-semibold text-lg"> Market Admin Hub </span>
      </a>

      <!-- Sidebar content -->
      <nav class="py-4">
        <ul class="nav flex flex-col">
          <!-- Add your category link here -->
          <li class="nav-item">
            <router-link
              to="/admin/category/add"
              class="w-full py-2 transition-all hover:text-white hover:bg-blue-600 hover:pl-8 hover:max-w-full"
            >
              Add Category
            </router-link>
          </li>
        </ul>
      </nav>
    </aside>

    <!-- Add Category Form -->
    <div class="mb-4">
      <h2 class="text-2xl font-bold mb-4">Add Category</h2>
      <form @submit.prevent="submitForm">
        <!-- Category Name Input -->
        <div class="mb-4">
          <label
            for="categoryName"
            class="block text-sm font-medium text-gray-600"
            >Category Name:</label
          >
          <input
            type="text"
            id="categoryName"
            v-model="categoryName"
            class="mt-1 p-2 border rounded-md w-full"
            placeholder="Enter category name"
            required
          />
        </div>

        <!-- Category Description Input -->
        <div class="mb-4">
          <label
            for="categoryDescription"
            class="block text-sm font-medium text-gray-600"
            >Category Description:</label
          >
          <textarea
            id="categoryDescription"
            v-model="categoryDescription"
            class="mt-1 p-2 border rounded-md w-full"
            placeholder="Enter category description"
          ></textarea>
        </div>

        <!-- Submit Button -->
        <button
          type="submit"
          class="bg-blue-500 text-white px-4 py-2 rounded-md"
        >
          Add Category
        </button>
      </form>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      categoryName: "",
      categoryDescription: "",
      showMarketAdminHub: false,
    };
  },
  methods: {
    submitForm() {
      // Handle form submission, e.g., send data to the server
      console.log("Category Name:", this.categoryName);
      console.log("Category Description:", this.categoryDescription);
      // Reset form fields after submission if needed
      this.categoryName = "";
      this.categoryDescription = "";
    },
    toggleMarketAdminHub() {
      // Toggle the display of Market Admin Hub aside
      this.showMarketAdminHub = !this.showMarketAdminHub;
    },
  },
};
</script>

<style scoped>
/* Add custom styles for this component if needed */
</style>
