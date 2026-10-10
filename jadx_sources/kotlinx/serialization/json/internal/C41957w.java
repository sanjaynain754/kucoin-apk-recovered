package kotlinx.serialization.json.internal;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.w */
/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"Lkotlinx/serialization/json/internal/w;", "Lkotlinx/serialization/json/internal/n;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Lxg0/a;)V", "", "b", "()V", "q", "c", "d", "p", "Lxg0/a;", "", "I", FirebaseAnalytics.Param.LEVEL, "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nComposers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composers.kt\nkotlinx/serialization/json/internal/ComposerWithPrettyPrint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
public final class C41957w extends C41939n {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC46162a json;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int level;

    @Override // kotlinx.serialization.json.internal.C41939n
    /* JADX INFO: renamed from: b */
    public void mo91965b() {
        m91978o(true);
        this.level++;
    }

    @Override // kotlinx.serialization.json.internal.C41939n
    /* JADX INFO: renamed from: c */
    public void mo91966c() {
        m91978o(false);
        m91974k(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        int i11 = this.level;
        for (int i12 = 0; i12 < i11; i12++) {
            m91974k(this.json.getConfiguration().getPrettyPrintIndent());
        }
    }

    @Override // kotlinx.serialization.json.internal.C41939n
    /* JADX INFO: renamed from: p */
    public void mo91979p() {
        m91969f(' ');
    }

    @Override // kotlinx.serialization.json.internal.C41939n
    /* JADX INFO: renamed from: q */
    public void mo91980q() {
        this.level--;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41957w(@NotNull InternalJsonWriter writer, @NotNull AbstractC46162a json) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.json = json;
    }

    @Override // kotlinx.serialization.json.internal.C41939n
    /* JADX INFO: renamed from: d */
    public void mo91967d() {
        if (getWritingFirst()) {
            m91978o(false);
        } else {
            mo91966c();
        }
    }
}
