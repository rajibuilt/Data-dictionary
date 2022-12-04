package com.rajibuilt.Data.dictionary;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MerchantDetailsController {

    @RequestMapping(value = "merchant", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<MerchantDetails> merchantDetailsList() {
        MerchantDetails uid                 =           new MerchantDetails("uid", "Merchant's Unique " +
                "Identifier (TIN)", "Refer to the Code Book","Yes");

        MerchantDetails uidType                 =           new MerchantDetails("uidType", "Unique Identifier Type " +
                "Identifier (TIN)", "Refer to the Code Book","Yes");

        MerchantDetails businessName                 =           new MerchantDetails("businessName", "Business Name " +
                "Identifier (TIN)", "Refer to the Code Book","Yes");

        MerchantDetails title                 =           new MerchantDetails("title", "Director's Title" +
                "Identifier (TIN)", "Refer to the Code Book","Yes");

        MerchantDetails dirBvn                 =           new MerchantDetails("dirBvn", "Director's BVN " +
                "Identifier (TIN)", "","Yes");

        MerchantDetails dirFirstName                 =           new MerchantDetails("dirFirstName", "Director's First Name " +
                "Identifier (TIN)", "","Yes");

        MerchantDetails dirLastName                 =           new MerchantDetails("dirLastName", "Director's Last Name " +
                "Identifier (TIN)", "","Yes");
        MerchantDetails userName                 =           new MerchantDetails("userName", "User Name" +
                "Identifier (TIN)", "","Yes");
        MerchantDetails phone                 =           new MerchantDetails("phone", "Director's Phone Number " +
                "Identifier (TIN)", "Refer to the Code Book","Yes");
        MerchantDetails emailId                 =           new MerchantDetails("emailId", "Director's Email Address " +
                "Identifier (TIN)", "","Yes");
        MerchantDetails postalCode                 =           new MerchantDetails("postalCode", "Merchant's Postal Code " +
                "Identifier (TIN)", "","No");



        MerchantDetails city                 =           new MerchantDetails("city", "Merchant's Business Location (City)" +
                "Identifier (TIN)", "","Yes");



        MerchantDetails state                 =           new MerchantDetails("state", "Merchant's Business Location (State) " +
                "Identifier (TIN)", "","Yes");
        MerchantDetails lga                 =           new MerchantDetails("lga", "Merchant's Business Location (LGA) " +
                "Identifier (TIN)", "Refer to the Code Book","Yes");
        MerchantDetails address                 =           new MerchantDetails("address", "Merchant's Address" +
                "Identifier (TIN)", "Refer to the Code Book","Yes");


        MerchantDetails countryOfResidence                 =           new MerchantDetails("country of Residence", "Director's of Country of Residence" +
                "Identifier (TIN)", "Refer to the Code Book","Yes");


        MerchantDetails customerRiskRating                 =           new MerchantDetails("customerRiskRating", "Merchant's Customer Risk Rating " +
                "Identifier (TIN)", "Refer to the Code Book","Yes");
        MerchantDetails tier                 =           new MerchantDetails("tier", "Tier " +
                "Identifier (TIN)", "Refer to the Code Book","Yes");
        MerchantDetails accountNumber                 =           new MerchantDetails("accountNumber", "Merchant's Account Number " +
                "Identifier (TIN)", "Refer to the Code Book","Yes");
        MerchantDetails dirDateOfBirth                 =           new MerchantDetails("dirDateOfBirth", "Director's Date of Birth " +
                "Identifier (TIN)", "Refer to the Code Book","Yes");
        MerchantDetails countryOfBirth                 =           new MerchantDetails("countryOfBirth", "MDirector's Country of Birth " +
                "Identifier (TIN)", "Refer to the Code Book","Yes");
        MerchantDetails stateOfOrigin                 =           new MerchantDetails("stateOfOrigin", "Director's State of Origin" +
                "Identifier (TIN)", "Refer to the Code Book","Yes");
        MerchantDetails remarks                 =           new MerchantDetails("remarks", "Remarks" +
                "Identifier (TIN)", "Refer to the Code Book","No");







        List<MerchantDetails> list = new ArrayList<>();
        list.add(uid);
        list.add(uidType);
        list.add(businessName);
        list.add(title);
        list.add(dirBvn);
        list.add(dirFirstName);
        list.add(dirLastName);
        list.add(userName);
        list.add(phone);
        list.add(emailId);
        list.add(postalCode);
        list.add(city);
        list.add(state);
        list.add(lga);
        list.add(address);
        list.add(countryOfResidence);
        list.add(customerRiskRating);
        list.add(tier);
        list.add(accountNumber);
        list.add(dirDateOfBirth);
        list.add(countryOfBirth);
        list.add(stateOfOrigin);
        list.add(remarks);





        return list;
    }

    public class MerchantDetails
    {
        private String fieldName;
        private String description;
        private String allowableValue;
        private String Mandatory;

        public MerchantDetails(String fieldName, String description, String allowableValue, String mandatory) {
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
