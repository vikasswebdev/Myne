/**
 * Copyright (c) [2022 - Present] Stɑrry Shivɑm
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.starry.myne.epub.models

import kotlinx.serialization.Serializable

/**
 * Represents a chapter in an epub book.
 *
 * @param absPath The absolute path of the chapter.
 * @param title The title of the chapter.
 * @param body The body of the chapter.
 */
@Serializable
data class EpubChapter(
    val absPath: String,
    val title: String,
    val body: String
)