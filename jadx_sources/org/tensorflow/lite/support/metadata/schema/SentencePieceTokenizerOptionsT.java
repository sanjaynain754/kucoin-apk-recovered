package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public class SentencePieceTokenizerOptionsT {
    private AssociatedFileT[] sentencePieceModel = null;
    private AssociatedFileT[] vocabFile = null;

    public AssociatedFileT[] getSentencePieceModel() {
        return this.sentencePieceModel;
    }

    public AssociatedFileT[] getVocabFile() {
        return this.vocabFile;
    }

    public void setSentencePieceModel(AssociatedFileT[] associatedFileTArr) {
        this.sentencePieceModel = associatedFileTArr;
    }

    public void setVocabFile(AssociatedFileT[] associatedFileTArr) {
        this.vocabFile = associatedFileTArr;
    }
}
