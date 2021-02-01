package com.example.cache;

public class Exception {
private String errorCode;
private String errorMessage;
private String errorDescription;
public String getErrorCode() {
	return errorCode;
}
public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
}
public String getErrorMessage() {
	return errorMessage;
}
public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
public String getErrorDescription() {
	return errorDescription;
}
public void setErrorDescription(String errorDescription) {
	this.errorDescription = errorDescription;
}
public Exception(String errorCode, String errorMessage, String errorDescription) {
	super();
	this.errorCode = errorCode;
	this.errorMessage = errorMessage;
	this.errorDescription = errorDescription;
}

}
