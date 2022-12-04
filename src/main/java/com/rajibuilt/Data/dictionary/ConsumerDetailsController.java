package com.rajibuilt.Data.dictionary;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ConsumerDetailsController {

    @RequestMapping(value = "consumer", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<ConsumerDetails> consumerDetailsList() {


        ConsumerDetails uid1                 =           new ConsumerDetails("uid1",
                "Unique Identifier " +
                        "Identifier (TIN)", "Refer to code book","Yes");

        ConsumerDetails uidType                 =           new ConsumerDetails("uidType",
                "Unique Identifier Type " +
                        "Identifier (TIN)", "Refer to code book","Yes");

        ConsumerDetails title                 =           new ConsumerDetails("title",
                "Title " +
                        "Identifier (TIN)", "","No");

        ConsumerDetails firstName                 =           new ConsumerDetails("firstName",
                "First Name " +
                        "Identifier (TIN)", "","Yes");

        ConsumerDetails middleName                 =           new ConsumerDetails("middleName",
                "Middle Name " +
                        "Identifier (TIN)", "","No");


        ConsumerDetails lastName                   =           new ConsumerDetails("last Name",
                "Last Name " +
                        "Identifier (TIN)", "","Yes");

        ConsumerDetails userName                =           new ConsumerDetails("user name",
                "User Name " +
                        "Identifier (TIN)", "","Yes");

        ConsumerDetails phone                 =           new ConsumerDetails("phone",
                "Phone " +
                        "Identifier (TIN)", "","Yes");

        ConsumerDetails emailId                 =           new ConsumerDetails("email",
                "Email " +
                        "Identifier (TIN)", "","Yes");


        ConsumerDetails postalCode                 =           new ConsumerDetails("postal code",
                "Postal Code " +
                        "Identifier (TIN)", "","No");


        ConsumerDetails city                 =           new ConsumerDetails("city",
                "city " +
                        "Identifier (TIN)", "","Yes");

        ConsumerDetails state                 =           new ConsumerDetails("state",
                "State " +
                        "Identifier (TIN)", "Refer to code book","Yes");

        ConsumerDetails lga                 =           new ConsumerDetails("lga",
                "Lga " +
                        "Identifier (TIN)", "Refer to code book","No");

        ConsumerDetails address                 =           new ConsumerDetails("address",
                "Address " +
                        "Identifier (TIN)", "","Yes");


        ConsumerDetails countryOfResidence                 =           new ConsumerDetails("country of residence",
                "Country of Residence " +
                        "Identifier (TIN)", "Refer to code book","Yes");


        ConsumerDetails customerRiskRating                =           new ConsumerDetails("customer Risk rating",
                "customerRiskRatingr " +
                        "Identifier (TIN)", "","Yes");

        ConsumerDetails tier                 =           new ConsumerDetails("tier",
                "tier " +
                        "Identifier (TIN)", "Refer to code book","Yes");

        ConsumerDetails accountNumber                 =           new ConsumerDetails("account number",
                "accountNumber " +
                        "Identifier (TIN)", "","Yes");

        ConsumerDetails taxIdentificationNumber                 =           new ConsumerDetails("taxIdentificationNumber",
                "taxIdentificationNumber " +
                        "Identifier (TIN)", "","No");


        ConsumerDetails dateOfBirth                 =           new ConsumerDetails("date of birth",
                "dateOfBirth " +
                        "Identifier (TIN)", "","Yes");


        ConsumerDetails countryOfBirth                 =           new ConsumerDetails("country of birth",
                "countryOfBirth " +
                        "Identifier (TIN)", "Refer to code book","Yes");

        ConsumerDetails stateOfOrigin                 =           new ConsumerDetails("state of origin",
                "stateOfOrigin " +
                        "Identifier (TIN)", "Refer to code book","Yes");


        ConsumerDetails remarks                 =           new ConsumerDetails("remarks",
                "remarks " +
                        "Identifier (TIN)", "","No");




        List<ConsumerDetails> list = new ArrayList<>();
        list.add(uid1);
        list.add(uidType);
        list.add(title);
        list.add(firstName);
        list.add(middleName);
        list.add(lastName);
        list.add(userName);
        list.add(phone);
        list.add(emailId);
        list.add(postalCode);
        list.add(city );
        list.add(state);
        list.add(lga);
        list.add(address);
        list.add(countryOfResidence);
        list.add(customerRiskRating);
        list.add(tier);
        list.add(accountNumber);
        list.add(taxIdentificationNumber);
        list.add(dateOfBirth);
        list.add(countryOfBirth);
        list.add(stateOfOrigin);
        list.add(remarks);

        return list;









    }


    public class ConsumerDetails {
        private String fieldName;
        private String description;
        private String allowableValue;
        private String Mandatory;


        public ConsumerDetails(String fieldName, String description, String allowableValue, String mandatory) {
            this.fieldName = fieldName;
            this.description = description;
            this.allowableValue = allowableValue;
            Mandatory = mandatory;
        }

        public String getFieldName() {
            return fieldName;
        }

        public void setFieldName(String fieldName) {
            this.fieldName = fieldName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAllowableValue() {
            return allowableValue;
        }

        public void setAllowableValue(String allowableValue) {
            this.allowableValue = allowableValue;
        }

        public String getMandatory() {
            return Mandatory;
        }

        public void setMandatory(String mandatory) {
            Mandatory = mandatory;
        }
    }

}
