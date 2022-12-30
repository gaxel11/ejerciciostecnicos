package documents.HumanResources;

import java.time.LocalDate;
import java.util.List;

public class CV {
    String fullName;
    LocalDate ageOrDateOfBirth;
    String emailAddress;
    String phoneNumber;
    String academicEducation;
    List<String> skills;

    /**
     * 
     * CV class constructor.
     *
     * @param fullName          Full name of the candidate.
     * @param ageOrDateOfBirth  Age or date of birth of the candidate.
     * @param emailAddress      Email address of the candidate.
     * @param phoneNumber       Phone number of the candidate.
     * @param academicEducation Academic education of the candidate.
     * @param skills            Knowledge and skills of the candidate.
     */
    public CV(String fullName, LocalDate ageOrDateOfBirth, String emailAddress, String phoneNumber,
            String academicEducation, List<String> skills) {
        this.fullName = fullName;
        this.ageOrDateOfBirth = ageOrDateOfBirth;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.academicEducation = academicEducation;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "CV [fullName=" + fullName + ", ageOrDateOfBirth=" + ageOrDateOfBirth + ", emailAddress=" + emailAddress
                + ", phoneNumber=" + phoneNumber + ", academicEducation=" + academicEducation + ", skills=" + skills
                + "]";
    }

}
