package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public class RegexTokenizerOptionsT {
    private String delimRegexPattern = null;
    private AssociatedFileT[] vocabFile = null;

    public String getDelimRegexPattern() {
        return this.delimRegexPattern;
    }

    public AssociatedFileT[] getVocabFile() {
        return this.vocabFile;
    }

    public void setDelimRegexPattern(String str) {
        this.delimRegexPattern = str;
    }

    public void setVocabFile(AssociatedFileT[] associatedFileTArr) {
        this.vocabFile = associatedFileTArr;
    }
}
