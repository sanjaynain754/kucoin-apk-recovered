package com.kubi.resources.guideview;

/* JADX INFO: loaded from: classes11.dex */
class BuildException extends RuntimeException {
    private static final long serialVersionUID = 6208777692136933357L;
    private final String mDetailMessage;

    public BuildException() {
        this.mDetailMessage = "General error.";
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Build GuideFragment failed: " + this.mDetailMessage;
    }

    public BuildException(String str) {
        this.mDetailMessage = str;
    }
}
