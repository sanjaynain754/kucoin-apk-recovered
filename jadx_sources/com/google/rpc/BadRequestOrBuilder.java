package com.google.rpc;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
public interface BadRequestOrBuilder extends MessageLiteOrBuilder {
    BadRequest.FieldViolation getFieldViolations(int i11);

    int getFieldViolationsCount();

    List<BadRequest.FieldViolation> getFieldViolationsList();
}
