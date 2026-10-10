package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import java.util.Arrays;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\u001a8\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u0006\b"}, m90084d2 = {"buildKeyList", "", "", "step", DropFrameTable.COLUMN_SCENE, "side", "field", "docType", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPhotoStepStateHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhotoStepStateHelper.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/PhotoStepStateHelperKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
public final class PhotoStepStateHelperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> buildKeyList(String str, String str2, String str3, String str4, String str5) {
        String str6 = String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{str, str2, str3, str4, str5}, 5));
        String str7 = String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{str, str2, str3, str4}, 4));
        String str8 = String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{RemoteConfigComponent.DEFAULTS_FILE_NAME, str2, str3, str4}, 4));
        String str9 = !Intrinsics.areEqual(str4, "text") ? str4 : null;
        if (str9 == null) {
            str9 = "brief";
        }
        String str10 = String.format("sns_step_%s_%s", Arrays.copyOf(new Object[]{str, str9}, 2));
        if (Intrinsics.areEqual(str4, "text")) {
            str4 = null;
        }
        return CollectionsKt.listOf((Object[]) new String[]{str6, str7, str8, str10, String.format("sns_step_%s_%s", Arrays.copyOf(new Object[]{RemoteConfigComponent.DEFAULTS_FILE_NAME, str4 != null ? str4 : "brief"}, 2))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> buildKeyList(String str, String str2, String str3) {
        String str4 = String.format("sns_step_%s_%s_%s", Arrays.copyOf(new Object[]{str, str2, str3}, 3));
        String str5 = String.format("sns_step_%s_%s_%s", Arrays.copyOf(new Object[]{RemoteConfigComponent.DEFAULTS_FILE_NAME, str2, str3}, 3));
        String str6 = !Intrinsics.areEqual(str3, "text") ? str3 : null;
        if (str6 == null) {
            str6 = "brief";
        }
        String str7 = String.format("sns_step_%s_%s", Arrays.copyOf(new Object[]{str, str6}, 2));
        if (Intrinsics.areEqual(str3, "text")) {
            str3 = null;
        }
        return CollectionsKt.listOf((Object[]) new String[]{str4, str5, str7, String.format("sns_step_%s_%s", Arrays.copyOf(new Object[]{RemoteConfigComponent.DEFAULTS_FILE_NAME, str3 != null ? str3 : "brief"}, 2))});
    }
}
