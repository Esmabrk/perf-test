console.log("🚀 Starting performance test...");

const start = Date.now();

// simulation de charge
for (let i = 0; i < 200000000; i++) {}

const end = Date.now();

console.log("⏱ Duration:", end - start, "ms");