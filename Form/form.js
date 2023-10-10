document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("survey-form");
    const popup = document.getElementById("popup");
    const closePopup = document.getElementById("close-popup");
    const popupData = document.getElementById("popup-data");
    const select = document.getElementById("country");

    const countries = [
        "India",
        "Bhutan",
        "Russia",
        "Israel",
        // Add more countries here
    ];

    countries.forEach((country) => {
        const option = document.createElement("option");
        option.value = country;
        option.textContent = country;
        select.appendChild(option);
    });

    form.addEventListener("submit", function(e) {
        e.preventDefault();
        const formData = new FormData(form);
        let popupContent = "<ul>";

        for (const [key, value] of formData.entries()) {
            popupContent += `<li><strong>${key}:</strong> ${value}</li>`;
        }

        popupContent += "</ul>";
        popupData.innerHTML = popupContent;
        popup.style.display = "flex";
    });

    closePopup.addEventListener("click", function() {
        popup.style.display = "none";
        form.reset();
    });
});