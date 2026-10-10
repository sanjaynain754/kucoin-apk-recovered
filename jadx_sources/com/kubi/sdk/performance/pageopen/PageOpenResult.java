package com.kubi.sdk.performance.pageopen;

import com.google.zxing.client.android.Intents;
import com.sensorsdata.abtest.entity.AppConstants;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PageOpenModels.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/performance/pageopen/PageOpenResult;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", AppConstants.AB_TEST_SUCCESS, "ABORT", Intents.Scan.TIMEOUT, "BACKGROUND", "Companion", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum PageOpenResult {
    SUCCESS("success"),
    ABORT("abort"),
    TIMEOUT("timeout"),
    BACKGROUND("background");


    @NotNull
    private final String value;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f47200c = EnumEntriesKt.enumEntries(m57363a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: PageOpenModels.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/performance/pageopen/PageOpenResult$Companion;", "", "<init>", "()V", "fromValue", "Lcom/kubi/sdk/performance/pageopen/PageOpenResult;", "value", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nPageOpenModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageOpenModels.kt\ncom/kubi/sdk/performance/pageopen/PageOpenResult$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n295#2,2:132\n*S KotlinDebug\n*F\n+ 1 PageOpenModels.kt\ncom/kubi/sdk/performance/pageopen/PageOpenResult$Companion\n*L\n19#1:132,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final PageOpenResult fromValue(@Nullable String value) {
            PageOpenResult next;
            Iterator<PageOpenResult> it = PageOpenResult.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(next.getValue(), value)) {
                    return next;
                }
            }
            next = null;
            return next;
        }
    }

    @NotNull
    public static EnumEntries<PageOpenResult> getEntries() {
        return f47200c;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    PageOpenResult(String str) {
        this.value = str;
    }
}
