package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.react.common.ReactConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p633t6.InterfaceC44695a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC44695a
public class Inspector {
    private final HybridData mHybridData;

    @InterfaceC44695a
    public static class Page {
        private final int mId;
        private final String mTitle;
        private final String mVM;

        public int getId() {
            return this.mId;
        }

        public String getTitle() {
            return this.mTitle;
        }

        public String getVM() {
            return this.mVM;
        }

        public String toString() {
            return "Page{mId=" + this.mId + ", mTitle='" + this.mTitle + "'}";
        }

        @InterfaceC44695a
        private Page(int i11, String str, String str2) {
            this.mId = i11;
            this.mTitle = str;
            this.mVM = str2;
        }
    }

    @InterfaceC44695a
    public interface RemoteConnection {
        @InterfaceC44695a
        void onDisconnect();

        @InterfaceC44695a
        void onMessage(String str);
    }

    private native LocalConnection connectNative(int i11, RemoteConnection remoteConnection);

    private native Page[] getPagesNative();

    private static native Inspector instance();

    @InterfaceC44695a
    public static class LocalConnection {
        private final HybridData mHybridData;

        public native void disconnect();

        public native void sendMessage(String str);

        private LocalConnection(HybridData hybridData) {
            this.mHybridData = hybridData;
        }
    }

    static {
        ReactBridge.staticInit();
    }

    private Inspector(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static LocalConnection connect(int i11, RemoteConnection remoteConnection) {
        try {
            LocalConnection localConnectionConnectNative = instance().connectNative(i11, remoteConnection);
            if (localConnectionConnectNative != null) {
                return localConnectionConnectNative;
            }
            throw new IllegalStateException("Can't open failed connection");
        } catch (UnsatisfiedLinkError e11) {
            C45999a.m101508n(ReactConstants.TAG, "Inspector doesn't work in open source yet", e11);
            throw new RuntimeException(e11);
        }
    }

    public static List<Page> getPages() {
        try {
            return Arrays.asList(instance().getPagesNative());
        } catch (UnsatisfiedLinkError e11) {
            C45999a.m101508n(ReactConstants.TAG, "Inspector doesn't work in open source yet", e11);
            return Collections.EMPTY_LIST;
        }
    }
}
