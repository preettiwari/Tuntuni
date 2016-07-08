/*
 * Copyright 2016 Sudipto Chandra.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tuntuni.models;

/**
 * Defined a few types of connection status client and server.
 */
public enum Status {

    INVALID(0),
    // to pass state information
    STATE(1),
    // to pass user profile information
    PROFILE(2),
    // to pass a single message
    MESSAGE(3);

    private final int mData;

    Status(int data) {
        mData = data;
    }

    public byte data() {
        return (byte) mData;
    }

    public static Status from(byte data) {
        for (Status status : Status.values()) {
            if (status.data() == data) {
                return status;
            }
        }
        return Status.INVALID;
    }
}
