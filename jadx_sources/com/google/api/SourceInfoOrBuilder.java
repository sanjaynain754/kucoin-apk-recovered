package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
public interface SourceInfoOrBuilder extends MessageLiteOrBuilder {
    Any getSourceFiles(int i11);

    int getSourceFilesCount();

    List<Any> getSourceFilesList();
}
