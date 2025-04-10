package org.fluent.pattern.dto;


import lombok.Getter;

@Getter
public class EmailContext {
    private final String useCase;
    private final String country;
    private final String language;
    private final String businessType;
    private final String segment;
    private final String channel;

    @Override
    public String toString() {
        return "EmailContext{" +
                "useCase='" + useCase + '\'' +
                ", country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", businessType='" + businessType + '\'' +
                ", segment='" + segment + '\'' +
                ", channel='" + channel + '\'' +
                '}';
    }

    private EmailContext(String useCase, String country, String language, String businessType,
                         String segment, String channel) {
        this.useCase = useCase;
        this.country = country;
        this.language = language;
        this.businessType = businessType;
        this.segment = segment;
        this.channel = channel;
    }

   public interface UseCaseStep{
        CountryStep useCase(String useCase);
   }

    public interface CountryStep{
        LanguageStep country(String country);
    }

    public interface LanguageStep{
        BusinessTypeStep language(String language);

    }
    public interface BusinessTypeStep{
        ChannelStep business(String businessType);
    }

    public interface ChannelStep{
        SegmentStep channel(String channel);
    }

    public interface  SegmentStep{
        Builder segment(String segment);
    }

    public interface Builder{
        EmailContext build();
    }

    public static UseCaseStep builder(){
        return new EmailContextBuilder();
    }


    public static class EmailContextBuilder implements UseCaseStep, CountryStep, LanguageStep,
            BusinessTypeStep, ChannelStep,SegmentStep, Builder{

        private String useCase;
        private String country;
        private String language;
        private String businessType;
        private String segment;
        private String channel;

        @Override
        public ChannelStep business(String businessType) {
            this.businessType = businessType;  // Set value for businessType
            return this;
        }

        @Override
        public SegmentStep channel(String channel) {
            this.channel = channel;  // Set value for channel
            return this;
        }

        @Override
        public LanguageStep country(String country) {
            this.country = country;  // Set value for country
            return this;
        }

        @Override
        public BusinessTypeStep language(String language) {
            this.language = language;  // Set value for language
            return this;
        }

        @Override
        public Builder segment(String segment) {
            this.segment = segment;  // Set value for segment
            return this;
        }

        @Override
        public CountryStep useCase(String useCase) {
            this.useCase = useCase;  // Set value for useCase
            return this;
        }

        @Override
        public EmailContext build() {
            return new EmailContext(useCase, country, language, businessType, segment, channel);
        }
    }
}
