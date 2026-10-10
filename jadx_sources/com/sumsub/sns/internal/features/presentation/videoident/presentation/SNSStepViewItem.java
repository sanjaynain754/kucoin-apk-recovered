package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSStepViewItem;", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "title", "", "state", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSStepViewItem$State;", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSStepViewItem$State;)V", "getIcon", "()Ljava/lang/String;", "getTitle", "()Ljava/lang/CharSequence;", "getState", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSStepViewItem$State;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "State", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* data */ class SNSStepViewItem {

    @Nullable
    private final String icon;

    @NotNull
    private final State state;

    @Nullable
    private final CharSequence title;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSStepViewItem$State;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "SELECTED", "DONE", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum State {
        DEFAULT,
        SELECTED,
        DONE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SNSStepViewItem)) {
            return false;
        }
        SNSStepViewItem sNSStepViewItem = (SNSStepViewItem) other;
        return Intrinsics.areEqual(this.icon, sNSStepViewItem.icon) && Intrinsics.areEqual(this.title, sNSStepViewItem.title) && this.state == sNSStepViewItem.state;
    }

    public static /* synthetic */ SNSStepViewItem copy$default(SNSStepViewItem sNSStepViewItem, String str, CharSequence charSequence, State state, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sNSStepViewItem.icon;
        }
        if ((i11 & 2) != 0) {
            charSequence = sNSStepViewItem.title;
        }
        if ((i11 & 4) != 0) {
            state = sNSStepViewItem.state;
        }
        return sNSStepViewItem.copy(str, charSequence, state);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final State getState() {
        return this.state;
    }

    @NotNull
    public final SNSStepViewItem copy(@Nullable String icon, @Nullable CharSequence title, @NotNull State state) {
        return new SNSStepViewItem(icon, title, state);
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @Nullable
    public final CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.icon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.title;
        return this.state.hashCode() + ((iHashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.icon;
        CharSequence charSequence = this.title;
        return "SNSStepViewItem(icon=" + str + ", title=" + ((Object) charSequence) + ", state=" + this.state + ")";
    }

    public SNSStepViewItem(@Nullable String str, @Nullable CharSequence charSequence, @NotNull State state) {
        this.icon = str;
        this.title = charSequence;
        this.state = state;
    }
}
