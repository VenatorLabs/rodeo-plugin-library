/*
 * Copyright (c) 2023 Venator Labs, LLC. All Rights Reserved.
 * This code is licensed under the MIT License.
 *
 * For license terms, see LICENSE
 */

package org.venatorlabs.rodeo.plugin;

/**
 * Base interface for creating a Rodeo plugin.
 */
public interface RodeoPlugin extends IHookable {
    public String getName();

    public String getDescription();
}
