package com.example.crypx.domain.model

import com.example.crypx.data.remote.dto.Links
import com.example.crypx.data.remote.dto.LinksExtended
import com.example.crypx.data.remote.dto.Tag
import com.example.crypx.data.remote.dto.Team
import com.example.crypx.data.remote.dto.Whitepaper

data class CoinDetail(
    val description: String,
    val development_status: String,
    val first_data_at: String,
    val hardware_wallet: Boolean,
    val hash_algorithm: String,
    val id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val last_data_at: String,
    val links: Links,
    val links_extended: List<LinksExtended>,
    val logo: String,
    val message: String,
    val name: String,
    val open_source: Boolean,
    val org_structure: String,
    val proof_type: String,
    val rank: Int,
    val started_at: String,
    val symbol: String,
    val tags: List<Tag>,
    val team: List<Team>,
    val type: String,
    val whitepaper: Whitepaper
)