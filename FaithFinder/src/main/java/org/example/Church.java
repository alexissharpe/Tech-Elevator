package org.example;

class Church {
    //instance variables
    private String state;
    private String denomination;
    private String name;
    private String address;
    private String city;
    private String zipCode;
    private String phoneNumber;
    private String website;

    //constructor
    protected Church(String lineOfText) {
        String[] churchDetails = lineOfText.split("\\|");

        this.state = churchDetails[0];
        this.denomination = churchDetails[1];
        this.name = churchDetails[2];
        this.address = churchDetails[3];
        this.city = churchDetails[4];
        this.zipCode = churchDetails[5];
        this.phoneNumber = churchDetails[6];
        this.website = churchDetails[7];
    }

    //other methods
    @Override
    public String toString() {
        String churchEntry = name + System.lineSeparator()
                            + denomination + System.lineSeparator()
                            + city + ", " + state + " " + zipCode;
        return churchEntry;
    }

    //getters
    public String getState() {
        return state;
    }

    public String getDenomination() {
        return denomination;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getWebsite() {
        return website;
    }
}
