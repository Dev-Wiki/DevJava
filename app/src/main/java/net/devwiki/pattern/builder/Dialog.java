package net.devwiki.pattern.builder;

public class Dialog {

    private Builder builder;

    public Dialog(Builder builder) {
        this.builder = builder;
    }



    public class Builder {
        private String title;
        private String content;
        private String primaryButton;
        private String secondButton;

        public Builder() {

        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setPrimaryButton(String primaryButton) {
            this.primaryButton = primaryButton;
            return this;
        }

        public Builder setSecondButton(String secondButton) {
            this.secondButton = secondButton;
            return this;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getPrimaryButton() {
            return primaryButton;
        }

        public String getSecondButton() {
            return secondButton;
        }

        public Dialog build() {
            return new Dialog(this);
        }
    }

    interface OnButtonClickListener {
        void onClick();
    }
}
