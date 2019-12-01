class BankManager {

    public static void main(String[] args){

        System.out.println("THE BANK OF TOMORROW");

        int quantityOfLoans;
        quantityOfLoans = 7;
        System.out.println(quantityOfLoans);

        int numberOfMadeDeposits;
        numberOfMadeDeposits = 100;
        System.out.println(numberOfMadeDeposits);

        String[] loanProductsNames = {
                "consumer loan", "students loan", "mortgage loan", "investment loans", "working capital loans",
                "fast loan", "overdraft"
        };

        System.out.println();
        System.out.println(loanProductsNames[0]);

        System.out.println();
        System.out.println(loanProductsNames.length);

        int lastNameOfLoanProduct = loanProductsNames.length -1;
        System.out.println();
        System.out.println(lastNameOfLoanProduct);

        String[] depositProducts = {
                "open deposit", "standard time deposit", "child savings", "golden years",
        };


        System.out.println();
        System.out.println(depositProducts[0]);

        System.out.println();
        System.out.println(depositProducts.length);

        int lastNameOfDepositProduct = depositProducts.length -1;
        System.out.println();
        System.out.println(lastNameOfDepositProduct);

        boolean hasActivity = true;
        boolean isActive = false;

        System.out.println();
        System.out.println(hasActivity);

        System.out.println();
        System.out.println(isActive);

        double allAvailableAmounts = 1545321.75;

        System.out.println();
        System.out.println(allAvailableAmounts);













    }
}
