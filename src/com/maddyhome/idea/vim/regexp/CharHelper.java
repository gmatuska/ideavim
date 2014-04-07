/*
 * IdeaVim - Vim emulator for IDEs based on the IntelliJ platform
 * Copyright (C) 2003-2014 The IdeaVim authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.maddyhome.idea.vim.regexp;

import org.jetbrains.annotations.NotNull;

public class CharHelper {
  @NotNull
  public static CharPointer skipwhite(@NotNull CharPointer ptr) {
    while (CharacterClasses.isWhite(ptr.charAt())) {
      ptr.inc();
    }

    return ptr;
  }

  public static int getdigits(@NotNull CharPointer ptr) {
    int res = 0;
    while (CharacterClasses.isDigit(ptr.charAt())) {
      res = res * 10 + (ptr.charAt() - '0');
      ptr.inc();
    }

    return res;
  }

  private CharHelper() {
  }
}
