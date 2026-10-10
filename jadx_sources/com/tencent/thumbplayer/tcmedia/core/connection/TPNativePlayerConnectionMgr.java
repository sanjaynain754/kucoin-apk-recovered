package com.tencent.thumbplayer.tcmedia.core.connection;

import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.tcmedia.core.player.TPNativePlayer;

/* JADX INFO: loaded from: classes63.dex */
public class TPNativePlayerConnectionMgr {
    private boolean mIsLibLoaded;
    private boolean mInited = false;
    private long mNativeContext = 0;

    private native int _activeAllConnections();

    private native int _activeConnection(int i11);

    private native int _addConnection(Object obj, Object obj2, Object obj3, Object obj4);

    private native int _addConnectionWithAddr(long j11, Object obj, long j12, Object obj2);

    private native void _deactiveAllConnections();

    private native void _deactiveConnection(int i11);

    private native void _init();

    private native void _removeConnection(int i11);

    private native void _unInit();

    public int addConnection(long j11, TPNativePlayerConnectionNode tPNativePlayerConnectionNode, long j12, TPNativePlayerConnectionNode tPNativePlayerConnectionNode2) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _addConnectionWithAddr(j11, tPNativePlayerConnectionNode, j12, tPNativePlayerConnectionNode2);
        }
        throw new IllegalStateException("Failed to addConnection due to invalid state.");
    }

    public int activeAllConnections() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _activeAllConnections();
        }
        throw new IllegalStateException("Failed to addConnection due to invalid state.");
    }

    public int activeConnection(int i11) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _activeConnection(i11);
        }
        throw new IllegalStateException("Failed to addConnection due to invalid state.");
    }

    public int addConnection(TPNativePlayer tPNativePlayer, TPNativePlayerConnectionNode tPNativePlayerConnectionNode, TPNativePlayer tPNativePlayer2, TPNativePlayerConnectionNode tPNativePlayerConnectionNode2) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _addConnection(tPNativePlayer, tPNativePlayerConnectionNode, tPNativePlayer2, tPNativePlayerConnectionNode2);
        }
        throw new IllegalStateException("Failed to addConnection due to invalid state.");
    }

    public void deactiveAllConnections() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new IllegalStateException("Failed to addConnection due to invalid state.");
        }
        _deactiveAllConnections();
    }

    public void deactiveConnection(int i11) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new IllegalStateException("Failed to addConnection due to invalid state.");
        }
        _deactiveConnection(i11);
    }

    public void init() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            throw new IllegalStateException("Failed to init due to invalid state.");
        }
        this.mInited = true;
        _init();
    }

    public void removeConnection(int i11) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new IllegalStateException("Failed to addConnection due to invalid state.");
        }
        _removeConnection(i11);
    }

    public void unInit() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            this.mInited = false;
            _unInit();
        }
    }

    public TPNativePlayerConnectionMgr() {
        this.mIsLibLoaded = false;
        try {
            TPNativeLibraryLoader.loadLibIfNeeded(null);
            this.mIsLibLoaded = true;
        } catch (UnsupportedOperationException e11) {
            e11.printStackTrace();
            this.mIsLibLoaded = false;
        }
    }
}
