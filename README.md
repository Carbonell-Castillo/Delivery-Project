# Delivery Project
This is a delivery project that allows users to register and log in as customers or administrators. During registration, users must specify their user type and upload a profile picture. The password validation feature checks if the password contains special characters and uppercase letters.

In the administrator section, the user can view a detailed summary of all orders, which is divided into the following areas:

- Management of kiosks
- Management of regions and prices
- Management of departments and municipalities
- Reports

The reports section provides the following information:

- List of regions with the most shipments
- Total number of packages shipped
- Total revenue
- List of users with the most packages shipped
- List of registered users

Each report has its respective filter to search for specific information. The administrator can change the price for the package size for shipping.

In the customer section, the user can view a summary of all orders placed, the number of registered credit cards, billing information, and the package's status. Customers can register multiple credit cards and billing information. During registration, the credit card number validation ensures that the number is not repeated.

Customers can also obtain a package quote by entering the following information:

- Origin:
  - Department
  - Municipality
- Destination:
  - Department
  - Municipality
- Number of packages to send
- Total weight of packages

After entering the necessary information, the system will generate a quote. Customers can then purchase the package by entering their billing information and selecting their payment method (credit card or cash on delivery). If cash on delivery is selected, the system will add Q5 to the total amount. Credit card validation is included during checkout, which prompts the user to enter the CVV and checks its validity.

After purchasing the package, the customer can download the invoice and the shipping label (barcode). The barcode is automatically generated when an order is placed. Customers can also view a report of all orders placed and search for a specific order using the package code. The purchase validation feature ensures that the package code is not repeated. The invoice and shipping label are generated in HTML and displayed in the default web browser.

Finally, the user can update their personal information, including their profile picture, password, and other details.

## Project Structure
The project is divided into the following sections:

- User registration
- Data management and reports (administrator)
  - Kiosk management
  - Region and price management
  - Department and municipality management
  - Reports
- Package and billing management (customer)
  - Credit/debit card registration
  - Billing information registration
  - Package quote
  - Purchase
  - Download invoice and shipping label
  - View orders placed
- Visual
  - Login
  - User registration
  - Quote, payment, and invoice download
  - Package details or shipping label number
  - Invoice

The project was developed using NetBeans, Java, Ant, and ArrayList. The necessary libraries are already included in the repository.

## Installation Instructions
To run this project, you will need to have the NetBeans IDE and a compatible version of Java installed.

1. Clone or download the repository from Github
2. Open the project in NetBeans
3. Compile and run the project

## Usage
Once the project is running, follow the on-screen instructions to perform the actions mentioned above.

## Contributions
If you would like to contribute to this project, you can create a new branch and submit a pull request with your changes. It will be reviewed before being incorporated into the main project.

## License
This project is available under the MIT license.
