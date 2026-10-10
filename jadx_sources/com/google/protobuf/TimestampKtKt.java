package com.google.protobuf;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TimestampKt.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, m90084d2 = {"timestamp", "Lcom/google/protobuf/Timestamp;", "block", "Lkotlin/Function1;", "Lcom/google/protobuf/TimestampKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializetimestamp", "copy", "protobuf-kotlin-lite"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class TimestampKtKt {
    @JvmName(name = "-initializetimestamp")
    @NotNull
    /* JADX INFO: renamed from: -initializetimestamp, reason: not valid java name */
    public static final Timestamp m103784initializetimestamp(@NotNull Function1<? super TimestampKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.INSTANCE;
        Timestamp.Builder builderNewBuilder = Timestamp.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        TimestampKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Timestamp copy(@NotNull Timestamp timestamp, @NotNull Function1<? super TimestampKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(timestamp, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.INSTANCE;
        Timestamp.Builder builder = timestamp.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        TimestampKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
