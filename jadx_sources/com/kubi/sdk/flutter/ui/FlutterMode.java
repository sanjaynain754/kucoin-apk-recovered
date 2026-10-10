package com.kubi.sdk.flutter.ui;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.kubi.sdk.flutter.ui.s, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CustomFlutterView.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/flutter/ui/FlutterMode;", "", "<init>", "()V", "Surface", "Texture", "Lcom/kubi/sdk/flutter/ui/FlutterMode$Surface;", "Lcom/kubi/sdk/flutter/ui/FlutterMode$Texture;", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class FlutterMode {

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.ui.s$a */
    /* JADX INFO: compiled from: CustomFlutterView.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/flutter/ui/FlutterMode$Surface;", "Lcom/kubi/sdk/flutter/ui/FlutterMode;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class a extends FlutterMode {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f46781a = new a();

        public a() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof a);
        }

        @NotNull
        public String toString() {
            return "Surface";
        }

        public int hashCode() {
            return 454041018;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.ui.s$b */
    /* JADX INFO: compiled from: CustomFlutterView.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/flutter/ui/FlutterMode$Texture;", "Lcom/kubi/sdk/flutter/ui/FlutterMode;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class b extends FlutterMode {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f46782a = new b();

        public b() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        @NotNull
        public String toString() {
            return "Texture";
        }

        public int hashCode() {
            return 889456168;
        }
    }

    public /* synthetic */ FlutterMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public FlutterMode() {
    }
}
