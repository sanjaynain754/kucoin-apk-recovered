package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class OpReorderer {
    final Callback mCallback;

    public interface Callback {
        AdapterHelper.UpdateOp obtainUpdateOp(int i11, int i12, int i13, Object obj);

        void recycleUpdateOp(AdapterHelper.UpdateOp updateOp);
    }

    private void swapMoveAdd(List<AdapterHelper.UpdateOp> list, int i11, AdapterHelper.UpdateOp updateOp, int i12, AdapterHelper.UpdateOp updateOp2) {
        int i13 = updateOp.itemCount;
        int i14 = updateOp2.positionStart;
        int i15 = i13 < i14 ? -1 : 0;
        int i16 = updateOp.positionStart;
        if (i16 < i14) {
            i15++;
        }
        if (i14 <= i16) {
            updateOp.positionStart = i16 + updateOp2.itemCount;
        }
        int i17 = updateOp2.positionStart;
        if (i17 <= i13) {
            updateOp.itemCount = i13 + updateOp2.itemCount;
        }
        updateOp2.positionStart = i17 + i15;
        list.set(i11, updateOp2);
        list.set(i12, updateOp);
    }

    public void swapMoveRemove(List<AdapterHelper.UpdateOp> list, int i11, AdapterHelper.UpdateOp updateOp, int i12, AdapterHelper.UpdateOp updateOp2) {
        boolean z11;
        int i13 = updateOp.positionStart;
        int i14 = updateOp.itemCount;
        boolean z12 = false;
        if (i13 < i14) {
            if (updateOp2.positionStart == i13 && updateOp2.itemCount == i14 - i13) {
                z11 = false;
                z12 = true;
            } else {
                z11 = false;
            }
        } else if (updateOp2.positionStart == i14 + 1 && updateOp2.itemCount == i13 - i14) {
            z11 = true;
            z12 = true;
        } else {
            z11 = true;
        }
        int i15 = updateOp2.positionStart;
        if (i14 < i15) {
            updateOp2.positionStart = i15 - 1;
        } else {
            int i16 = updateOp2.itemCount;
            if (i14 < i15 + i16) {
                updateOp2.itemCount = i16 - 1;
                updateOp.cmd = 2;
                updateOp.itemCount = 1;
                if (updateOp2.itemCount == 0) {
                    list.remove(i12);
                    this.mCallback.recycleUpdateOp(updateOp2);
                    return;
                }
                return;
            }
        }
        int i17 = updateOp.positionStart;
        int i18 = updateOp2.positionStart;
        AdapterHelper.UpdateOp updateOpObtainUpdateOp = null;
        if (i17 <= i18) {
            updateOp2.positionStart = i18 + 1;
        } else {
            int i19 = updateOp2.itemCount;
            if (i17 < i18 + i19) {
                updateOpObtainUpdateOp = this.mCallback.obtainUpdateOp(2, i17 + 1, (i18 + i19) - i17, null);
                updateOp2.itemCount = updateOp.positionStart - updateOp2.positionStart;
            }
        }
        if (z12) {
            list.set(i11, updateOp2);
            list.remove(i12);
            this.mCallback.recycleUpdateOp(updateOp);
            return;
        }
        if (z11) {
            if (updateOpObtainUpdateOp != null) {
                int i21 = updateOp.positionStart;
                if (i21 > updateOpObtainUpdateOp.positionStart) {
                    updateOp.positionStart = i21 - updateOpObtainUpdateOp.itemCount;
                }
                int i22 = updateOp.itemCount;
                if (i22 > updateOpObtainUpdateOp.positionStart) {
                    updateOp.itemCount = i22 - updateOpObtainUpdateOp.itemCount;
                }
            }
            int i23 = updateOp.positionStart;
            if (i23 > updateOp2.positionStart) {
                updateOp.positionStart = i23 - updateOp2.itemCount;
            }
            int i24 = updateOp.itemCount;
            if (i24 > updateOp2.positionStart) {
                updateOp.itemCount = i24 - updateOp2.itemCount;
            }
        } else {
            if (updateOpObtainUpdateOp != null) {
                int i25 = updateOp.positionStart;
                if (i25 >= updateOpObtainUpdateOp.positionStart) {
                    updateOp.positionStart = i25 - updateOpObtainUpdateOp.itemCount;
                }
                int i26 = updateOp.itemCount;
                if (i26 >= updateOpObtainUpdateOp.positionStart) {
                    updateOp.itemCount = i26 - updateOpObtainUpdateOp.itemCount;
                }
            }
            int i27 = updateOp.positionStart;
            if (i27 >= updateOp2.positionStart) {
                updateOp.positionStart = i27 - updateOp2.itemCount;
            }
            int i28 = updateOp.itemCount;
            if (i28 >= updateOp2.positionStart) {
                updateOp.itemCount = i28 - updateOp2.itemCount;
            }
        }
        list.set(i11, updateOp2);
        if (updateOp.positionStart != updateOp.itemCount) {
            list.set(i12, updateOp);
        } else {
            list.remove(i12);
        }
        if (updateOpObtainUpdateOp != null) {
            list.add(i11, updateOpObtainUpdateOp);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    public void swapMoveUpdate(List<AdapterHelper.UpdateOp> list, int i11, AdapterHelper.UpdateOp updateOp, int i12, AdapterHelper.UpdateOp updateOp2) {
        AdapterHelper.UpdateOp updateOpObtainUpdateOp;
        int i13;
        int i14;
        int i15;
        int i16 = updateOp.itemCount;
        int i17 = updateOp2.positionStart;
        AdapterHelper.UpdateOp updateOpObtainUpdateOp2 = null;
        if (i16 >= i17) {
            int i18 = updateOp2.itemCount;
            if (i16 < i17 + i18) {
                updateOp2.itemCount = i18 - 1;
                updateOpObtainUpdateOp = this.mCallback.obtainUpdateOp(4, updateOp.positionStart, 1, updateOp2.payload);
            }
            i13 = updateOp.positionStart;
            i14 = updateOp2.positionStart;
            if (i13 <= i14) {
                updateOp2.positionStart = i14 + 1;
            } else {
                i15 = updateOp2.itemCount;
                if (i13 < i14 + i15) {
                    int i19 = (i14 + i15) - i13;
                    updateOpObtainUpdateOp2 = this.mCallback.obtainUpdateOp(4, i13 + 1, i19, updateOp2.payload);
                    updateOp2.itemCount -= i19;
                }
            }
            list.set(i12, updateOp);
            if (updateOp2.itemCount > 0) {
                list.set(i11, updateOp2);
            } else {
                list.remove(i11);
                this.mCallback.recycleUpdateOp(updateOp2);
            }
            if (updateOpObtainUpdateOp != null) {
                list.add(i11, updateOpObtainUpdateOp);
            }
            if (updateOpObtainUpdateOp2 != null) {
                list.add(i11, updateOpObtainUpdateOp2);
            }
        }
        updateOp2.positionStart = i17 - 1;
        updateOpObtainUpdateOp = null;
        i13 = updateOp.positionStart;
        i14 = updateOp2.positionStart;
        if (i13 <= i14) {
            updateOp2.positionStart = i14 + 1;
        } else {
            i15 = updateOp2.itemCount;
            if (i13 < i14 + i15) {
                int i110 = (i14 + i15) - i13;
                updateOpObtainUpdateOp2 = this.mCallback.obtainUpdateOp(4, i13 + 1, i110, updateOp2.payload);
                updateOp2.itemCount -= i110;
            }
        }
        list.set(i12, updateOp);
        if (updateOp2.itemCount > 0) {
            list.set(i11, updateOp2);
        } else {
            list.remove(i11);
            this.mCallback.recycleUpdateOp(updateOp2);
        }
        if (updateOpObtainUpdateOp != null) {
            list.add(i11, updateOpObtainUpdateOp);
        }
        if (updateOpObtainUpdateOp2 != null) {
            list.add(i11, updateOpObtainUpdateOp2);
        }
    }

    public OpReorderer(Callback callback) {
        this.mCallback = callback;
    }

    private int getLastMoveOutOfOrder(List<AdapterHelper.UpdateOp> list) {
        boolean z11 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).cmd == 8) {
                if (z11) {
                    return size;
                }
            } else {
                z11 = true;
            }
        }
        return -1;
    }

    private void swapMoveOp(List<AdapterHelper.UpdateOp> list, int i11, int i12) {
        AdapterHelper.UpdateOp updateOp = list.get(i11);
        AdapterHelper.UpdateOp updateOp2 = list.get(i12);
        int i13 = updateOp2.cmd;
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 4) {
                    return;
                }
                swapMoveUpdate(list, i11, updateOp, i12, updateOp2);
                return;
            }
            swapMoveRemove(list, i11, updateOp, i12, updateOp2);
            return;
        }
        swapMoveAdd(list, i11, updateOp, i12, updateOp2);
    }

    public void reorderOps(List<AdapterHelper.UpdateOp> list) {
        while (true) {
            int lastMoveOutOfOrder = getLastMoveOutOfOrder(list);
            if (lastMoveOutOfOrder != -1) {
                swapMoveOp(list, lastMoveOutOfOrder, lastMoveOutOfOrder + 1);
            } else {
                return;
            }
        }
    }
}
