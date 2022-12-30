package documents;

import java.time.LocalDate;

public class Document {
    public Integer id;
    public LocalDate creationDate;

    /**
     * Generic document constructor.
     *
     * @param id           Document number.
     * @param creationDate Creation date of the document.
     */
    public Document(Integer id, LocalDate creationDate) {
        this.id = id;
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Document [id=" + id + ", creationDate=" + creationDate + "]";
    }

}
