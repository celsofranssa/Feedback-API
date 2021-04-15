package br.dcc.ufmg.feedbackapi.feedbackapi.model;

public class Info {
    private final String version = "0.2.0";
    private final String developer = "Celso França";
    private final String support = "https://github.com/celsofranssa/Feedback-API";


    public String getVersion() {
        return version;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getSupport() {
        return support;
    }
}
