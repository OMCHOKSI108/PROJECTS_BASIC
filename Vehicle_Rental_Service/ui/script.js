document.getElementById('rentalForm').addEventListener('submit', function (e) {
    e.preventDefault();

    const vehicleType = document.getElementById('vehicleType').value;
    const actionType = document.getElementById('actionType').value;
    const rentalList = document.getElementById('rentalList');
    const rentalItem = document.createElement('li');

    let message = '';
    if (actionType === 'rent') {
        message = `${vehicleType} rented successfully.`;
    } else if (actionType === 'return') {
        message = `${vehicleType} returned successfully.`;
    }

    rentalItem.textContent = message;
    rentalList.appendChild(rentalItem);

    // Clear form fields after submission
    document.getElementById('rentalForm').reset();
});
