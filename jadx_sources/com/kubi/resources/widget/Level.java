package com.kubi.resources.widget;

import androidx.webkit.Profile;
import com.kubi.sdk.res.R$color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.resources.widget.k1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LevelIndicatorView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/Level;", "", "color", "", "getColor", "()I", Profile.DEFAULT_PROFILE_NAME, "Green", "Yellow", "Red", "Lcom/kubi/resources/widget/Level$Default;", "Lcom/kubi/resources/widget/Level$Green;", "Lcom/kubi/resources/widget/Level$Red;", "Lcom/kubi/resources/widget/Level$Yellow;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface Level {

    /* JADX INFO: renamed from: com.kubi.resources.widget.k1$a */
    /* JADX INFO: compiled from: LevelIndicatorView.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/resources/widget/Level$Default;", "Lcom/kubi/resources/widget/Level;", "<init>", "()V", "color", "", "getColor", "()I", "equals", "", "other", "", "hashCode", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class a implements Level {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f44928a = new a();

        /* JADX INFO: renamed from: b */
        public static final int f44929b = R$color.c_icon40;

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof a);
        }

        @Override // com.kubi.resources.widget.Level
        /* JADX INFO: renamed from: a */
        public int mo55374a() {
            return f44929b;
        }

        @NotNull
        public String toString() {
            return Profile.DEFAULT_PROFILE_NAME;
        }

        public int hashCode() {
            return 178229254;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.k1$b */
    /* JADX INFO: compiled from: LevelIndicatorView.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/resources/widget/Level$Green;", "Lcom/kubi/resources/widget/Level;", "<init>", "()V", "color", "", "getColor", "()I", "equals", "", "other", "", "hashCode", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class b implements Level {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f44930a = new b();

        /* JADX INFO: renamed from: b */
        public static final int f44931b = R$color.brandGreen;

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        @Override // com.kubi.resources.widget.Level
        /* JADX INFO: renamed from: a */
        public int mo55374a() {
            return f44931b;
        }

        @NotNull
        public String toString() {
            return "Green";
        }

        public int hashCode() {
            return 1630156296;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.k1$c */
    /* JADX INFO: compiled from: LevelIndicatorView.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/resources/widget/Level$Red;", "Lcom/kubi/resources/widget/Level;", "<init>", "()V", "color", "", "getColor", "()I", "equals", "", "other", "", "hashCode", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class c implements Level {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final c f44932a = new c();

        /* JADX INFO: renamed from: b */
        public static final int f44933b = R$color.brandRed;

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof c);
        }

        @Override // com.kubi.resources.widget.Level
        /* JADX INFO: renamed from: a */
        public int mo55374a() {
            return f44933b;
        }

        @NotNull
        public String toString() {
            return "Red";
        }

        public int hashCode() {
            return -1710023466;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.k1$d */
    /* JADX INFO: compiled from: LevelIndicatorView.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/resources/widget/Level$Yellow;", "Lcom/kubi/resources/widget/Level;", "<init>", "()V", "color", "", "getColor", "()I", "equals", "", "other", "", "hashCode", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class d implements Level {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final d f44934a = new d();

        /* JADX INFO: renamed from: b */
        public static final int f44935b = R$color.complementary;

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof d);
        }

        @Override // com.kubi.resources.widget.Level
        /* JADX INFO: renamed from: a */
        public int mo55374a() {
            return f44935b;
        }

        @NotNull
        public String toString() {
            return "Yellow";
        }

        public int hashCode() {
            return -501228017;
        }
    }

    /* JADX INFO: renamed from: a */
    int mo55374a();
}
