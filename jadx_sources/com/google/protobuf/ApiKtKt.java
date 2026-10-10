package com.google.protobuf;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApiKt.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\f\u001a)\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, m90084d2 = {"sourceContextOrNull", "Lcom/google/protobuf/SourceContext;", "Lcom/google/protobuf/ApiOrBuilder;", "getSourceContextOrNull", "(Lcom/google/protobuf/ApiOrBuilder;)Lcom/google/protobuf/SourceContext;", "api", "Lcom/google/protobuf/Api;", "block", "Lkotlin/Function1;", "Lcom/google/protobuf/ApiKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeapi", "copy", "protobuf-kotlin-lite"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ApiKtKt {
    @JvmName(name = "-initializeapi")
    @NotNull
    /* JADX INFO: renamed from: -initializeapi, reason: not valid java name */
    public static final Api m103763initializeapi(@NotNull Function1<? super ApiKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.INSTANCE;
        Api.Builder builderNewBuilder = Api.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        ApiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Api copy(@NotNull Api api, @NotNull Function1<? super ApiKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(api, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.INSTANCE;
        Api.Builder builder = api.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        ApiKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final SourceContext getSourceContextOrNull(@NotNull ApiOrBuilder apiOrBuilder) {
        Intrinsics.checkNotNullParameter(apiOrBuilder, "<this>");
        if (apiOrBuilder.hasSourceContext()) {
            return apiOrBuilder.getSourceContext();
        }
        return null;
    }
}
