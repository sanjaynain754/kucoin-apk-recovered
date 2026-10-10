package com.google.api;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
public interface ContextOrBuilder extends MessageLiteOrBuilder {
    ContextRule getRules(int i11);

    int getRulesCount();

    List<ContextRule> getRulesList();
}
