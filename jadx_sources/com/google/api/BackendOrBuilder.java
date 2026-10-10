package com.google.api;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
public interface BackendOrBuilder extends MessageLiteOrBuilder {
    BackendRule getRules(int i11);

    int getRulesCount();

    List<BackendRule> getRulesList();
}
