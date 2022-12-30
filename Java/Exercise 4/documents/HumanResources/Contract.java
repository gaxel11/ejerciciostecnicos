package documents.HumanResources;

import java.time.LocalDate;
import java.util.List;

import documents.Document;

public class Contract extends Document {

    List<String> involvedPartiesNames;
    LocalDate contractTerm;

    /**
     * 
     * Contract class constructor.
     *
     * @param involvedPartiesNames Names of the parties involved in the contract
     * @param contractNumber       Contract number
     * @param issueDate            Issue date of the contract
     * @param contractTerm         Contract term
     */
    public Contract(List<String> involvedPartiesNames, Integer contractNumber, LocalDate issueDate,
            LocalDate contractTerm) {
        super(contractNumber, contractTerm);
        this.involvedPartiesNames = involvedPartiesNames;
        this.contractTerm = contractTerm;
    }

    @Override
    public String toString() {
        return "Contract [involvedPartiesNames=" + involvedPartiesNames + ", contractTerm=" + contractTerm + "]";
    }

}
