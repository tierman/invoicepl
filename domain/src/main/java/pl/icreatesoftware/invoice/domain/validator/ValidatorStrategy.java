package pl.icreatesoftware.invoice.domain.validator;

public interface ValidatorStrategy {
    public boolean validate(ObjectToValidate object);
}
