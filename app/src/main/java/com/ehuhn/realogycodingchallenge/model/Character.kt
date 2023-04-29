package com.ehuhn.realogycodingchallenge.model

data class Character(
    var id: String    = "-1",
    val Abstract: String,
    val AbstractSource: String,
    val AbstractText: String,
    val AbstractURL: String,
    val Answer: String,
    val AnswerType: String,
    val Definition: String,
    val DefinitionSource: String,
    val DefinitionURL: String,
    val Entity: String,
    val Heading: String,
    val Image: String,
    val ImageHeight: Int,
    val ImageIsLogo: Int,
    val ImageWidth: Int,
    val Infobox: String,
    val Redirect: String,
    val RelatedTopics: List<RelatedTopic>,
    val Results: List<Any>,
    val Type: String,
    val meta: Meta
)

data class RelatedTopic(
    var FirstURL: String,
    val Icon: Icon,
    val Result: String,
    val Text: String
)

data class Meta(
    val attribution: Any,
    val blockgroup: Any,
    val created_date: Any,
    val description: String,
    val designer: Any,
    val dev_date: Any,
    val dev_milestone: String,
    val developer: List<Developer>,
    val example_query: String,
    val id: String,
    val is_stackexchange: Any,
    val js_callback_name: String,
    val live_date: Any,
    val maintainer: Maintainer,
    val name: String,
    val perl_module: String,
    val producer: Any,
    val production_state: String,
    val repo: String,
    val signal_from: String,
    val src_domain: String,
    val src_id: Int,
    val src_name: String,
    val src_options: SrcOptions,
    val src_url: Any,
    val status: String,
    val tab: String,
    val topic: List<String>,
    val unsafe: Int
)

data class Icon(
    val Height: String,
    val URL: String,
    val Width: String
)

data class Developer(
    val name: String,
    val type: String,
    val url: String
)

data class Maintainer(
    val github: String
)

data class SrcOptions(
    val directory: String,
    val is_fanon: Int,
    val is_mediawiki: Int,
    val is_wikipedia: Int,
    val language: String,
    val min_abstract_length: String,
    val skip_abstract: Int,
    val skip_abstract_paren: Int,
    val skip_end: String,
    val skip_icon: Int,
    val skip_image_name: Int,
    val skip_qr: String,
    val source_skip: String,
    val src_info: String
)


