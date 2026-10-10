package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface TXUGCPartsManager {

    public interface JoinAllPartsListener {
        void onJoinAllParts(int i11);
    }

    void addClipInfo(PartInfo partInfo);

    void deleteAllParts();

    void deleteLastPart();

    void deletePart(int i11);

    int getDuration();

    List<String> getPartsPathList();

    void insertPart(String str, int i11);

    boolean joinAllParts(String str, JoinAllPartsListener joinAllPartsListener);
}
