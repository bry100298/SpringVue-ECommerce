<template>
  <div class="container mx-auto my-8">
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
      <button type="submit" class="bg-blue-500 text-white px-4 py-2 rounded-md">
        Add Category
      </button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      categoryName: "",
      categoryDescription: "",
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
  },
};
</script>

<style scoped>
/* Add custom styles for this component if needed */
</style>
