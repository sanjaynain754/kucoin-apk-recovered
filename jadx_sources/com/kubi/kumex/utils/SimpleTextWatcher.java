package com.kubi.kumex.utils;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.kumex.utils.j0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ViewEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kumex/utils/SimpleTextWatcher;", "Landroid/text/TextWatcher;", "<init>", "()V", "beforeTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "afterTextChanged", "Landroid/text/Editable;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class SimpleTextWatcher implements TextWatcher {
    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable s11) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence s11, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence s11, int start, int before, int count) {
    }
}
