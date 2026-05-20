const express = require('express');

const app = express();

app.get('/api/users', (req, res) => {
  res.json({ users: ['Alice', 'Bob', 'Charlie'] });
});

app.listen(3000, () => {
  console.log('Server running on http://localhost:3000');
});