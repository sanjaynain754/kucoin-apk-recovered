package com.sumsub.sns.core.data.listener;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0001\fJ@\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H&¨\u0006\r"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "", "onVerificationStep", "Landroid/view/View;", "context", "Landroid/content/Context;", "verificationStep", "", "idDocumentType", DropFrameTable.COLUMN_SCENE, ViewProps.POSITION, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "Position", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface SNSInstructionsViewHandler {

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FULLSCREEN", "BOTTOMSHEET", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum Position {
        FULLSCREEN("fullScreen"),
        BOTTOMSHEET("bottomSheet");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        private final String value;

        @NotNull
        public static EnumEntries<Position> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        Position(String str) {
            this.value = str;
        }
    }

    @Nullable
    View onVerificationStep(@NotNull Context context, @NotNull String verificationStep, @Nullable String idDocumentType, @NotNull String scene, @Nullable String position, @Nullable String countryCode);
}
