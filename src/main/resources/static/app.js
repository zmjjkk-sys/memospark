/* ── MemoSpark App ── */
const API = '/api';

// ── i18n ──────────────────────────────────────────────────
const i18n = {
  en: {
    // nav
    navDecks: '📚 Decks',
    navReview: '🔄 Review',
    navStats: '📊 Stats',
    navImport: '⬆️ Import',
    // decks view
    myDecks: 'My Decks',
    newDeck: '+ New Deck',
    loading: 'Loading…',
    noDecksYet: 'No decks yet',
    createDeckHint: 'Create a deck to get started!',
    due: 'due',
    cards: 'cards',
    builtin: '⭐ Built-in',
    custom: '✏️ Custom',
    settings: '⚙️ Settings',
    settingsTitle: 'Review Settings',
    settingsDesc: 'Set daily review limit for each deck (0 or empty = unlimited)',
    settingsSaved: 'Settings saved',
    dailyLimit: 'Limit',
    remaining: 'Remaining',
    reviewed: 'Reviewed',
    goalComplete: "Today's goal complete!",
    unlimited: 'Unlimited',
    // cards view
    back: '← Back',
    addCard: '+ Add Card',
    front: 'Front',
    back_col: 'Back',
    tags: 'Tags',
    actions: 'Actions',
    edit: 'Edit',
    del: 'Del',
    noCardsYet: 'No cards yet. Add one!',
    // review view
    question: 'Question',
    answer: 'Answer',
    flipHint: 'Click to reveal answer (or press Space)',
    again: 'Again',
    hard: 'Hard',
    good: 'Good',
    easy: 'Easy',
    allCaughtUp: 'All caught up!',
    noDueCards: 'No cards due for review right now.',
    sessionComplete: 'Session complete!',
    youReviewed: 'You reviewed {0} card(s).',
    reviewAgain: 'Review Again',
    cardOfTotal: 'Card {0} of {1}',
    reviewDeck: 'Review',
    // stats view
    statistics: 'Statistics',
    refresh: '↻ Refresh',
    totalCards: 'Total Cards',
    decks: 'Decks',
    dueToday: 'Due Today',
    reviewedToday: 'Reviewed Today',
    totalReviews: 'Total Reviews',
    retentionRate: 'Retention Rate',
    currentStreak: 'Current Streak',
    days: 'days',
    day: 'day',
    // deck modal
    newDeckTitle: 'New Deck',
    editDeckTitle: 'Edit Deck',
    nameLabel: 'Name *',
    descLabel: 'Description',
    deckNamePlaceholder: 'My Deck',
    descPlaceholder: 'Optional description…',
    dailyLimitLabel: 'Daily Review Limit',
    dailyLimitPlaceholder: '0 = unlimited',
    save: 'Save',
    cancel: 'Cancel',
    // card modal
    addCardTitle: 'Add Card',
    editCardTitle: 'Edit Card',
    frontLabel: 'Front (Question) *',
    backLabel: 'Back (Answer) *',
    tagsLabel: 'Tags',
    frontPlaceholder: 'What is …?',
    backPlaceholder: 'The answer is …',
    tagsPlaceholder: 'java,basics (comma-separated)',
    // import modal
    importCards: 'Import Cards',
    targetDeck: 'Target Deck',
    format: 'Format',
    file: 'File',
    close: 'Close',
    import: 'Import',
    // practice view
    navPractice: '💻 Practice',
    codeProblems: 'Code Problems',
    runCode: '▶ Run',
    submissionHistory: 'Submission History',
    language: 'Lang',
    statusCol: 'Status',
    passed: 'Passed',
    time: 'Time',
    noSubmissions: 'No submissions yet',
    running: 'Running...',
    addProblem: 'Add Problem',
    editProblem: 'Edit Problem',
    hint: 'Hint',
    aiHint: 'AI Hint',
    aiHintLoading: 'Thinking...',
    aiHintLevel1: 'Give me a direction',
    aiHintLevel2: 'More detail',
    aiHintLevel3: 'Show pseudocode',
    aiGenerate: 'AI Generate Cards',
    aiGenerateTitle: 'AI Generate Cards',
    aiTopic: 'Topic',
    aiTopicPlaceholder: 'e.g. Redis interview questions',
    aiCount: 'Count',
    aiGenerating: 'Generating...',
    aiGenerated: '{0} cards generated!',
    aiAddToDeck: 'Add to Deck',
    aiTargetDeck: 'Target Deck',
    aiNewDeck: 'Create New Deck',
    aiNewPoolDeck: 'Create New Pool Deck',
    aiNewDeckPlaceholder: 'New deck name...',
    // new/review labels
    newCards: 'New',
    reviewCardsLabel: 'Review',
    badgeNew: 'New',
    badgeReview: 'Review',
    dailyNewLimit: 'New/day',
    dailyNewLimitLabel: 'Daily New Card Limit',
    dailyNewLimitPlaceholder: '0 = unlimited',
    newLearned: 'Learned',
    preview: 'Preview',
    undo: 'Undo',
    undone: 'Review undone',
    exportJson: 'Export JSON',
    exportCsv: 'Export CSV',
    filterByTags: 'Filter by Tags',
    allTags: 'All (no filter)',
    startReviewBtn: 'Start Review',
    noTags: 'No tags in this deck',
    hardCards: 'Hard Cards',
    noHardCards: 'No hard cards yet. Keep reviewing!',
    searchPlaceholder: 'Search cards...',
    searchDeckPlaceholder: 'Search decks...',
    selectAll: 'All',
    batchDelete: 'Delete',
    batchMove: 'Move to...',
    moveTo: 'Move to deck',
    selectedCount: '{0} selected',
    batchDeleted: '{0} cards deleted',
    batchMoved: '{0} cards moved',
    confirmBatchDelete: 'Delete {0} selected card(s)?',
    srsSettings: 'SRS Algorithm',
    initialEase: 'Initial Ease',
    minEase: 'Min Ease',
    firstInterval: '1st Interval (days)',
    secondInterval: '2nd Interval (days)',
    srsReset: 'Reset Defaults',
    srsSaved: 'SRS settings saved',
    reviewTrend: 'Review Trend (30 days)',
    retentionTrend: 'Retention Trend (30 days)',
    reviewCount: 'Reviews',
    retention: 'Retention %',
    // auth
    logout: 'Logout',
    loggedInAs: 'Hi, {0}',
    noOwner: 'No owner',
    pool: 'Card Pool',
    poolManage: 'Card Pool',
    poolEmpty: 'No decks in the pool yet',
    poolAdded: 'Deck copied to your collection!',
    poolAlready: 'Browse and add decks to your collection',
    poolAddBtn: 'Add to Mine',
    poolCreate: '+ Add to Pool',
    poolCards: 'cards',
    // toast / confirm
    nameRequired: 'Name is required',
    deckCreated: 'Deck created',
    deckUpdated: 'Deck updated',
    deckDeleted: 'Deck deleted',
    cardAdded: 'Card added',
    cardUpdated: 'Card updated',
    cardDeleted: 'Card deleted',
    confirmDeleteDeck: 'Delete this deck and all its cards?',
    confirmDeleteCard: 'Delete this card?',
    frontBackRequired: 'Front and Back are required',
    selectFile: 'Please select a file',
    importError: 'Import error',
    error: 'Error',
  },
  zh: {
    // nav
    navDecks: '📚 牌组',
    navReview: '🔄 复习',
    navStats: '📊 统计',
    navImport: '⬆️ 导入',
    // decks view
    myDecks: '我的牌组',
    newDeck: '+ 新建牌组',
    loading: '加载中…',
    noDecksYet: '暂无牌组',
    createDeckHint: '创建一个牌组开始学习吧！',
    due: '待复习',
    cards: '张卡片',
    builtin: '⭐ 内置',
    custom: '✏️ 自定义',
    settings: '⚙️ 设置',
    settingsTitle: '复习设置',
    settingsDesc: '设置每个牌组每日复习上限（0 或留空 = 不限制）',
    settingsSaved: '设置已保存',
    dailyLimit: '上限',
    remaining: '剩余',
    reviewed: '已复习',
    goalComplete: '今日目标已完成！',
    unlimited: '不限制',
    // cards view
    back: '← 返回',
    addCard: '+ 添加卡片',
    front: '正面',
    back_col: '背面',
    tags: '标签',
    actions: '操作',
    edit: '编辑',
    del: '删除',
    noCardsYet: '暂无卡片，添加一张吧！',
    // review view
    question: '问题',
    answer: '答案',
    flipHint: '点击翻转查看答案（或按空格键）',
    again: '重来',
    hard: '困难',
    good: '良好',
    easy: '简单',
    allCaughtUp: '全部完成！',
    noDueCards: '目前没有待复习的卡片。',
    sessionComplete: '本次复习完成！',
    youReviewed: '你复习了 {0} 张卡片。',
    reviewAgain: '再次复习',
    cardOfTotal: '第 {0} 张，共 {1} 张',
    reviewDeck: '复习',
    // stats view
    statistics: '统计',
    refresh: '↻ 刷新',
    totalCards: '总卡片数',
    decks: '牌组数',
    dueToday: '今日待复习',
    reviewedToday: '今日已复习',
    totalReviews: '总复习次数',
    retentionRate: '记忆保持率',
    currentStreak: '连续天数',
    days: '天',
    day: '天',
    // deck modal
    newDeckTitle: '新建牌组',
    editDeckTitle: '编辑牌组',
    nameLabel: '名称 *',
    descLabel: '描述',
    deckNamePlaceholder: '我的牌组',
    descPlaceholder: '可选描述…',
    dailyLimitLabel: '每日复习上限',
    dailyLimitPlaceholder: '0 = 不限制',
    save: '保存',
    cancel: '取消',
    // card modal
    addCardTitle: '添加卡片',
    editCardTitle: '编辑卡片',
    frontLabel: '正面（问题）*',
    backLabel: '背面（答案）*',
    tagsLabel: '标签',
    frontPlaceholder: '什么是……？',
    backPlaceholder: '答案是……',
    tagsPlaceholder: 'java,基础（逗号分隔）',
    // import modal
    importCards: '导入卡片',
    targetDeck: '目标牌组',
    format: '格式',
    file: '文件',
    close: '关闭',
    import: '导入',
    // practice view
    navPractice: '💻 练习',
    codeProblems: '编程练习',
    runCode: '▶ 运行',
    submissionHistory: '提交历史',
    language: '语言',
    statusCol: '状态',
    passed: '通过',
    time: '时间',
    noSubmissions: '暂无提交记录',
    addProblem: '添加题目',
    editProblem: '编辑题目',
    hint: '提示',
    aiHint: 'AI 提示',
    aiHintLoading: '思考中...',
    aiHintLevel1: '给个方向',
    aiHintLevel2: '更详细一点',
    aiHintLevel3: '给伪代码',
    aiGenerate: 'AI 生成卡片',
    aiGenerateTitle: 'AI 生成卡片',
    aiTopic: '主题',
    aiTopicPlaceholder: '如：Redis 面试题',
    aiCount: '数量',
    aiGenerating: '生成中...',
    aiGenerated: '已生成 {0} 张卡片！',
    aiAddToDeck: '添加到牌组',
    aiTargetDeck: '目标牌组',
    aiNewDeck: '新建牌组',
    aiNewPoolDeck: '新建卡池牌组',
    aiNewDeckPlaceholder: '输入新牌组名称...',
    running: '运行中...',
    // new/review labels
    newCards: '新学',
    reviewCardsLabel: '复习',
    badgeNew: '新学',
    badgeReview: '复习',
    dailyNewLimit: '每日新学',
    dailyNewLimitLabel: '每日新卡上限',
    dailyNewLimitPlaceholder: '0 = 不限制',
    newLearned: '已学',
    preview: '预览',
    undo: '撤回',
    undone: '已撤回评分',
    exportJson: '导出 JSON',
    exportCsv: '导出 CSV',
    filterByTags: '按标签筛选',
    allTags: '全部（不筛选）',
    startReviewBtn: '开始复习',
    noTags: '此牌组暂无标签',
    hardCards: '困难卡片',
    noHardCards: '暂无困难卡片，继续复习吧！',
    searchPlaceholder: '搜索卡片...',
    searchDeckPlaceholder: '搜索牌组...',
    selectAll: '全选',
    batchDelete: '删除',
    batchMove: '移动到...',
    moveTo: '移动到牌组',
    selectedCount: '已选 {0} 张',
    batchDeleted: '已删除 {0} 张卡片',
    batchMoved: '已移动 {0} 张卡片',
    confirmBatchDelete: '确定删除选中的 {0} 张卡片？',
    srsSettings: 'SRS 算法参数',
    initialEase: '初始难度系数',
    minEase: '最小难度系数',
    firstInterval: '首次间隔（天）',
    secondInterval: '二次间隔（天）',
    srsReset: '恢复默认',
    srsSaved: 'SRS 参数已保存',
    reviewTrend: '复习趋势（30 天）',
    retentionTrend: '记忆保持率趋势（30 天）',
    reviewCount: '复习次数',
    retention: '保持率 %',
    // auth
    logout: '退出',
    loggedInAs: '你好, {0}',
    noOwner: '无归属',
    pool: '卡池',
    poolManage: '卡池管理',
    poolEmpty: '卡池暂无牌组',
    poolAdded: '已复制到你的牌组！',
    poolAlready: '浏览并添加喜欢的牌组',
    poolAddBtn: '添加到我的',
    poolCreate: '+ 添加到卡池',
    poolCards: '张卡片',
    // toast / confirm
    nameRequired: '名称不能为空',
    deckCreated: '牌组已创建',
    deckUpdated: '牌组已更新',
    deckDeleted: '牌组已删除',
    cardAdded: '卡片已添加',
    cardUpdated: '卡片已更新',
    cardDeleted: '卡片已删除',
    confirmDeleteDeck: '确定删除此牌组及其所有卡片吗？',
    confirmDeleteCard: '确定删除此卡片吗？',
    frontBackRequired: '正面和背面不能为空',
    selectFile: '请选择一个文件',
    importError: '导入出错',
    error: '错误',
  },
};

let currentLang = localStorage.getItem('lang') || 'zh';

// ── Theme toggle ────────────────────────────────────────────
function applyTheme(theme) {
  document.documentElement.setAttribute('data-theme', theme);
  localStorage.setItem('theme', theme);
  const btn = document.getElementById('theme-toggle');
  if (btn) btn.textContent = theme === 'dark' ? '☀️' : '🌙';
}

function toggleTheme() {
  const current = localStorage.getItem('theme') || 'light';
  applyTheme(current === 'dark' ? 'light' : 'dark');
}

// Apply saved theme immediately
applyTheme(localStorage.getItem('theme') || 'light');

function t(key, ...args) {
  let text = (i18n[currentLang] && i18n[currentLang][key]) || i18n.en[key] || key;
  args.forEach((val, i) => { text = text.replace(`{${i}}`, val); });
  return text;
}

function setLang(lang) {
  currentLang = lang;
  localStorage.setItem('lang', lang);
  document.documentElement.lang = lang === 'zh' ? 'zh-CN' : 'en';
  // Update all elements with data-i18n
  document.querySelectorAll('[data-i18n]').forEach(el => {
    el.textContent = t(el.dataset.i18n);
  });
  // Update all elements with data-i18n-placeholder
  document.querySelectorAll('[data-i18n-placeholder]').forEach(el => {
    el.placeholder = t(el.dataset.i18nPlaceholder);
  });
}

function toggleLang() {
  setLang(currentLang === 'en' ? 'zh' : 'en');
  // Re-render current view with new language
  const activeView = document.querySelector('.view.active');
  if (activeView) {
    if (activeView.id === 'decks-view' && state.decks.length) renderDecks(state.decks);
    else if (activeView.id === 'cards-view' && state.currentDeck) {
      document.getElementById('cards-deck-title').textContent = tDeckName(state.currentDeck);
      loadCards(state.currentDeck.id);
    }
    else if (activeView.id === 'stats-view') loadStats();
    else if (activeView.id === 'practice-view') {
      if (document.getElementById('practice-list').style.display !== 'none') loadProblems();
    }
  }
}

// ── Built-in content translation helpers ──────────────────
function tDeckName(deck) {
  if (currentLang === 'zh' && deck.type === 'BUILTIN' && builtinZh.decks[deck.name]) {
    return builtinZh.decks[deck.name].name;
  }
  return deck.name;
}

function tDeckDesc(deck) {
  if (currentLang === 'zh' && deck.type === 'BUILTIN' && builtinZh.decks[deck.name]) {
    return builtinZh.decks[deck.name].description;
  }
  return deck.description || '';
}

function tCardFront(frontText) {
  if (currentLang === 'zh' && builtinZh.cards[frontText]) {
    return builtinZh.cards[frontText].front;
  }
  return frontText;
}

function tCardBack(frontText, backText) {
  if (currentLang === 'zh' && builtinZh.cards[frontText]) {
    return builtinZh.cards[frontText].back;
  }
  return backText;
}

// ── State ──────────────────────────────────────────────────
const state = {
  decks: [],
  currentDeck: null,
  reviewQueue: [],
  reviewIndex: 0,
  reviewStartTime: 0,
  flipped: false,
  reviewDeckId: null,
  lastReviewedCardId: null,
  currentUser: null,
};

// ── Auth helpers ────────────────────────────────────────────
async function checkAuth() {
  try {
    const res = await fetch(API + '/auth/me');
    if (res.ok) {
      state.currentUser = await res.json();
      const display = document.getElementById('user-display');
      if (display) display.textContent = t('loggedInAs', state.currentUser.username);
      const logoutBtn = document.getElementById('logout-btn');
      if (logoutBtn) logoutBtn.style.display = '';
      return true;
    }
  } catch (e) { /* ignore */ }
  window.location.href = '/login.html';
  return false;
}

async function doLogout() {
  await fetch(API + '/auth/logout', { method: 'POST' });
  window.location.href = '/login.html';
}

// ── Helpers ────────────────────────────────────────────────
async function apiFetch(path, opts = {}) {
  const res = await fetch(API + path, {
    headers: { 'Content-Type': 'application/json', ...opts.headers },
    ...opts,
  });
  if (res.status === 401) {
    window.location.href = '/login.html';
    throw new Error('Not authenticated');
  }
  if (!res.ok) {
    const body = await res.json().catch(() => ({}));
    throw new Error(body.error || `HTTP ${res.status}`);
  }
  if (res.status === 204) return null;
  return res.json();
}

function showToast(msg, ms = 2800) {
  const t = document.getElementById('toast');
  t.textContent = msg;
  t.classList.add('show');
  setTimeout(() => t.classList.remove('show'), ms);
}

function showView(id) {
  document.querySelectorAll('.view').forEach(v => v.classList.remove('active'));
  document.getElementById(id).classList.add('active');
  document.querySelectorAll('nav button').forEach(b => {
    b.classList.toggle('active', b.dataset.view === id);
  });
}

// ── Deck List View ─────────────────────────────────────────
async function loadDecks() {
  showView('decks-view');
  const decks = await apiFetch('/decks');
  state.decks = decks;
  const searchInput = document.getElementById('deck-search-input');
  if (searchInput) searchInput.value = '';

  const isAdmin = state.currentUser && state.currentUser.role === 'ADMIN';
  const hardBtn = document.getElementById('hard-cards-btn');
  const poolBtn = document.getElementById('pool-btn');
  const newDeckBtn = document.getElementById('new-deck-btn');

  if (isAdmin) {
    if (hardBtn) hardBtn.style.display = 'none';
    if (poolBtn) { poolBtn.style.display = ''; poolBtn.textContent = '🏪 ' + t('poolManage'); poolBtn.onclick = openPoolManage; }
    if (newDeckBtn) newDeckBtn.style.display = 'none';
  } else {
    if (hardBtn) hardBtn.style.display = '';
    if (poolBtn) { poolBtn.style.display = ''; poolBtn.textContent = '🏪 ' + t('pool'); poolBtn.onclick = openPoolBrowse; }
    if (newDeckBtn) newDeckBtn.style.display = '';
  }

  renderDecks(decks);
}

function filterDecks() {
  const query = document.getElementById('deck-search-input').value.toLowerCase().trim();
  if (!query) { renderDecks(state.decks); return; }
  const filtered = state.decks.filter(d => {
    const name = tDeckName(d).toLowerCase();
    const desc = tDeckDesc(d).toLowerCase();
    return name.includes(query) || desc.includes(query);
  });
  renderDecks(filtered);
}

function renderDecks(decks) {
  const grid = document.getElementById('deck-grid');
  if (!decks.length) {
    grid.innerHTML = `<div class="empty" style="grid-column:1/-1">
      <div class="empty-icon">📚</div>
      <h3>${t('noDecksYet')}</h3>
      <p>${t('createDeckHint')}</p>
    </div>`;
    return;
  }

  const isAdmin = state.currentUser && state.currentUser.role === 'ADMIN';

  // Admin: grouped by user, compact table
  if (isAdmin) {
    const groups = {};
    decks.forEach(d => {
      const owner = d.ownerUsername || t('noOwner');
      if (!groups[owner]) groups[owner] = [];
      groups[owner].push(d);
    });
    grid.innerHTML = Object.entries(groups).map(([owner, userDecks]) => `
      <div class="admin-user-group" style="grid-column:1/-1">
        <div class="admin-user-header">👤 ${esc(owner)} <span class="admin-user-count">${userDecks.length} ${t('decks')}</span></div>
        <div class="admin-deck-list">
          ${userDecks.map(d => `
            <div class="admin-deck-row" onclick="openDeck(${d.id})">
              <span class="deck-type-badge badge-${d.type.toLowerCase()}" style="font-size:.65rem">${d.type === 'BUILTIN' ? '⭐' : '✏️'}</span>
              <span class="admin-deck-name">${esc(tDeckName(d))}</span>
              <span class="admin-deck-stat">${d.totalCards} ${t('cards')}</span>
              <span class="admin-deck-stat"><span class="due-count">${d.dueCards}</span> ${t('due')}</span>
              <span class="admin-deck-stat">${t('reviewed')}: ${d.reviewedToday || 0}</span>
              <div class="admin-deck-actions">
                <button class="btn btn-sm btn-secondary" onclick="editDeck(event,${d.id})" title="${t('edit')}">✏️</button>
                <button class="btn btn-sm btn-danger" onclick="deleteDeck(event,${d.id})" title="${t('del')}">🗑️</button>
              </div>
            </div>
          `).join('')}
        </div>
      </div>
    `).join('');
    return;
  }

  // Normal user: card grid
  grid.innerHTML = decks.map(d => {
    const limit = d.dailyReviewLimit;
    const reviewed = d.reviewedToday || 0;
    const hasLimit = limit && limit > 0;
    const remaining = hasLimit ? Math.max(0, limit - reviewed) : d.dueCards;
    const goalDone = hasLimit && reviewed >= limit;
    const pct = hasLimit ? Math.min(100, Math.round(reviewed / limit * 100)) : 0;

    let reviewInfoHtml;
    if (goalDone) {
      reviewInfoHtml = `<div class="deck-review-info completed">✅ ${t('goalComplete')}</div>`;
    } else if (hasLimit) {
      reviewInfoHtml = `<div class="deck-review-info">
        <span>${t('reviewed')}: ${reviewed}/${limit}</span>
        <div class="deck-review-progress"><div class="deck-review-progress-bar${pct>=100?' full':''}" style="width:${pct}%"></div></div>
        <span>${t('remaining')}: ${remaining}</span>
      </div>`;
    } else {
      reviewInfoHtml = `<div class="deck-review-info">
        <span>${t('reviewed')}: ${reviewed}</span>
        <span style="margin-left:auto">${t('due')}: ${d.dueCards}</span>
      </div>`;
    }

    return `
    <div class="deck-card" data-id="${d.id}" onclick="openDeck(${d.id})">
      <span class="deck-type-badge badge-${d.type.toLowerCase()}">${d.type === 'BUILTIN' ? t('builtin') : t('custom')}</span>
      <h3>${esc(tDeckName(d))}</h3>
      <p class="deck-meta" style="margin-bottom:.5rem">${esc(tDeckDesc(d))}</p>
      <div class="deck-meta">
        <span class="due-count">${d.dueCards} ${t('due')}</span> · ${d.totalCards} ${t('cards')}${hasLimit ? ` · ${t('dailyLimit')}: ${limit}` : ''}
      </div>
      <div class="deck-meta" style="margin-top:.25rem">
        <span class="badge-new-inline">${t('newCards')}: ${d.newCards || 0}${d.dailyNewCardLimit ? ' (' + t('newLearned') + ': ' + (d.newLearnedToday || 0) + '/' + d.dailyNewCardLimit + ')' : ''}</span>
        | <span class="badge-review-inline">${t('reviewCardsLabel')}: ${d.reviewCards || 0}</span>
      </div>
      ${reviewInfoHtml}
      ${!goalDone && remaining > 0 ? `<button class="btn btn-sm btn-primary" style="margin-top:.5rem;width:100%" onclick="startReview(event,${d.id})">🔄 ${t('reviewDeck')}</button>` : ''}
      <div class="deck-actions">
        <div class="deck-export-menu">
          <button class="btn btn-sm btn-secondary" onclick="toggleExportMenu(event,${d.id})" title="Export">📥</button>
          <div id="export-menu-${d.id}" class="export-dropdown hidden">
            <a href="${API}/export/json/${d.id}" onclick="event.stopPropagation()">${t('exportJson')}</a>
            <a href="${API}/export/csv/${d.id}" onclick="event.stopPropagation()">${t('exportCsv')}</a>
          </div>
        </div>
        <button class="btn btn-sm btn-secondary" onclick="editDeck(event,${d.id})" title="${t('edit')}">✏️</button>
        <button class="btn btn-sm btn-danger"    onclick="deleteDeck(event,${d.id})" title="${t('del')}">🗑️</button>
      </div>
    </div>`}).join('');
}

function toggleExportMenu(event, deckId) {
  event.stopPropagation();
  const menu = document.getElementById(`export-menu-${deckId}`);
  // Close all other menus
  document.querySelectorAll('.export-dropdown').forEach(el => {
    if (el !== menu) el.classList.add('hidden');
  });
  menu.classList.toggle('hidden');
}

// Close export menus when clicking elsewhere
document.addEventListener('click', () => {
  document.querySelectorAll('.export-dropdown').forEach(el => el.classList.add('hidden'));
});

// ── Open Deck (Card List) ───────────────────────────────────
async function openDeck(deckId) {
  showView('cards-view');
  let deck = state.decks.find(d => d.id === deckId);
  // If not found (e.g. pool deck), fetch from pool list
  if (!deck) {
    try {
      const poolDecks = await apiFetch('/decks/pool');
      deck = poolDecks.find(d => d.id === deckId);
    } catch (e) { /* ignore */ }
  }
  state.currentDeck = deck || { id: deckId, name: 'Deck' };
  document.getElementById('cards-deck-title').textContent = deck ? tDeckName(deck) : 'Deck';
  await loadCards(deckId);
}

async function loadCards(deckId) {
  try {
    const cards = await apiFetch(`/decks/${deckId}/cards`);
    state.currentCards = cards;
    document.getElementById('card-search-input').value = '';
    document.getElementById('select-all-cb').checked = false;
    hideBatchBar();
    renderCardTable(cards);
  } catch (e) {
    document.getElementById('cards-tbody').innerHTML =
      `<tr><td colspan="5" style="text-align:center;padding:2rem;color:var(--again)">${t('error')}: ${e.message}</td></tr>`;
  }
}

function renderCardTable(cards) {
  const tbody = document.getElementById('cards-tbody');
  if (!cards.length) {
    tbody.innerHTML = `<tr><td colspan="5" class="empty" style="padding:2rem;text-align:center;color:var(--muted)">${t('noCardsYet')}</td></tr>`;
    return;
  }
  tbody.innerHTML = cards.map(c => {
    const front = tCardFront(c.front);
    const back = tCardBack(c.front, c.back);
    return `
    <tr>
      <td><input type="checkbox" class="card-cb" value="${c.cardId}" onchange="updateBatchBar()"></td>
      <td title="${esc(front)}">${esc(truncate(front, 60))}</td>
      <td title="${esc(back)}">${esc(truncate(back, 60))}</td>
      <td>${esc(c.tags || '')}</td>
      <td>
        <button class="btn btn-sm btn-secondary" onclick="editCard(${state.currentDeck.id},${c.cardId})">${t('edit')}</button>
        <button class="btn btn-sm btn-danger" style="margin-left:.3rem" onclick="deleteCard(${state.currentDeck.id},${c.cardId})">${t('del')}</button>
      </td>
    </tr>`;
  }).join('');
}

// ── Search Cards ────────────────────────────────────────────
function filterCards() {
  const query = document.getElementById('card-search-input').value.toLowerCase().trim();
  if (!state.currentCards) return;
  if (!query) { renderCardTable(state.currentCards); return; }
  const filtered = state.currentCards.filter(c => {
    const front = (tCardFront(c.front) || '').toLowerCase();
    const back = (tCardBack(c.front, c.back) || '').toLowerCase();
    const tags = (c.tags || '').toLowerCase();
    return front.includes(query) || back.includes(query) || tags.includes(query);
  });
  renderCardTable(filtered);
}

// ── Batch Operations ────────────────────────────────────────
function toggleSelectAll(el) {
  document.querySelectorAll('.card-cb').forEach(cb => { cb.checked = el.checked; });
  updateBatchBar();
}

function getSelectedCardIds() {
  return [...document.querySelectorAll('.card-cb:checked')].map(cb => parseInt(cb.value));
}

function updateBatchBar() {
  const ids = getSelectedCardIds();
  if (ids.length > 0) {
    document.getElementById('batch-bar').classList.remove('hidden');
    document.getElementById('batch-count').textContent = t('selectedCount', ids.length);
  } else {
    hideBatchBar();
  }
}

function hideBatchBar() {
  document.getElementById('batch-bar').classList.add('hidden');
}

async function batchDeleteCards() {
  const ids = getSelectedCardIds();
  if (!ids.length) return;
  if (!confirm(t('confirmBatchDelete', ids.length))) return;
  try {
    await apiFetch(`/decks/${state.currentDeck.id}/cards/batch-delete`, {
      method: 'POST', body: JSON.stringify({ cardIds: ids }),
    });
    showToast(t('batchDeleted', ids.length));
    loadCards(state.currentDeck.id);
  } catch (e) { showToast(t('error') + ': ' + e.message); }
}

function openBatchMoveModal() {
  const sel = document.getElementById('batch-move-target');
  sel.innerHTML = state.decks
    .filter(d => d.id !== state.currentDeck.id)
    .map(d => `<option value="${d.id}">${esc(tDeckName(d))}</option>`).join('');
  document.getElementById('batch-move-modal').classList.remove('hidden');
}

function closeBatchMoveModal() {
  document.getElementById('batch-move-modal').classList.add('hidden');
}

async function confirmBatchMove() {
  const ids = getSelectedCardIds();
  const targetDeckId = parseInt(document.getElementById('batch-move-target').value);
  if (!ids.length || !targetDeckId) return;
  try {
    await apiFetch(`/decks/${state.currentDeck.id}/cards/batch-move`, {
      method: 'POST', body: JSON.stringify({ cardIds: ids, targetDeckId }),
    });
    showToast(t('batchMoved', ids.length));
    closeBatchMoveModal();
    loadCards(state.currentDeck.id);
  } catch (e) { showToast(t('error') + ': ' + e.message); }
}

function truncate(str, n) { return str.length > n ? str.slice(0, n) + '…' : str; }
function esc(s) { return String(s).replace(/&/g,'&amp;').replace(/</g,'&lt;').replace(/>/g,'&gt;').replace(/"/g,'&quot;'); }

// ── Hard Cards Review ────────────────────────────────────────
async function startHardReview() {
  const cards = await apiFetch('/review/hard');
  if (!cards.length) {
    showView('review-view');
    document.getElementById('review-content').innerHTML = `
      <div class="empty" style="padding:3rem">
        <div class="empty-icon">💪</div>
        <h3>${t('noHardCards')}</h3>
      </div>`;
    document.getElementById('review-controls').classList.remove('visible');
    document.getElementById('review-progress').textContent = '';
    return;
  }
  state.reviewQueue = cards;
  state.reviewIndex = 0;
  state.reviewDeckId = null;
  state.lastReviewedCardId = null;
  showView('review-view');
  showNextCard();
}

// ── Tag Filter ──────────────────────────────────────────────
async function startReview(event, deckId) {
  if (event && event.stopPropagation) event.stopPropagation();
  state.reviewDeckId = deckId || null;

  // If deck specified, try to show tag filter
  if (deckId) {
    try {
      const tags = await apiFetch(`/decks/${deckId}/tags`);
      if (tags.length > 0) {
        showTagFilterModal(deckId, tags);
        return;
      }
    } catch (e) { /* fall through to start without filter */ }
  }

  doStartReview(deckId, null);
}

function showTagFilterModal(deckId, tags) {
  const list = document.getElementById('tag-filter-list');
  list.innerHTML = `
    <label class="tag-filter-item">
      <input type="checkbox" id="tag-all" checked onchange="toggleAllTags(this)">
      <span>${t('allTags')}</span>
    </label>
    ${tags.map(tag => `
    <label class="tag-filter-item">
      <input type="checkbox" class="tag-cb" value="${esc(tag)}" checked>
      <span>${esc(tag)}</span>
    </label>`).join('')}`;
  state._tagFilterDeckId = deckId;
  document.getElementById('tag-filter-modal').classList.remove('hidden');
}

function toggleAllTags(el) {
  document.querySelectorAll('.tag-cb').forEach(cb => { cb.checked = el.checked; });
}

function closeTagFilterModal() {
  document.getElementById('tag-filter-modal').classList.add('hidden');
}

function confirmTagFilter() {
  const allChecked = document.getElementById('tag-all').checked;
  let selectedTags = null;
  if (!allChecked) {
    selectedTags = [...document.querySelectorAll('.tag-cb:checked')].map(cb => cb.value);
    if (selectedTags.length === 0) selectedTags = null; // treat as all
  }
  closeTagFilterModal();
  doStartReview(state._tagFilterDeckId, selectedTags);
}

async function doStartReview(deckId, tags) {
  let endpoint = deckId ? `/review/deck/${deckId}` : '/review/today';
  if (tags && tags.length > 0) {
    endpoint += '?' + tags.map(t => 'tags=' + encodeURIComponent(t)).join('&');
  }
  const cards = await apiFetch(endpoint);
  if (!cards.length) {
    showView('review-view');
    document.getElementById('review-content').innerHTML = `
      <div class="empty" style="padding:3rem">
        <div class="empty-icon">🎉</div>
        <h3>${t('allCaughtUp')}</h3>
        <p>${t('noDueCards')}</p>
      </div>`;
    document.getElementById('review-controls').classList.remove('visible');
    document.getElementById('review-progress').textContent = '';
    return;
  }
  state.reviewQueue = cards;
  state.reviewIndex = 0;
  state.lastReviewedCardId = null;
  showView('review-view');
  showNextCard();
}

function showNextCard() {
  const total = state.reviewQueue.length;
  const idx = state.reviewIndex;

  const progressEl = document.getElementById('review-progress');
  const undoHtml = state.lastReviewedCardId
    ? ` <button class="btn btn-sm btn-secondary btn-undo" onclick="undoLastReview()">↩ ${t('undo')}</button>`
    : '';
  progressEl.innerHTML = t('cardOfTotal', Math.min(idx + 1, total), total) + undoHtml;

  if (idx >= total) {
    document.getElementById('review-content').innerHTML = `
      <div class="empty" style="padding:3rem">
        <div class="empty-icon">🎉</div>
        <h3>${t('sessionComplete')}</h3>
        <p>${t('youReviewed', total)}</p>
        <button class="btn btn-primary" style="margin-top:1rem" onclick="startReview(null, ${state.reviewDeckId || 'null'})">${t('reviewAgain')}</button>
      </div>`;
    document.getElementById('review-controls').classList.remove('visible');
    document.getElementById('review-progress').textContent = '';
    launchFireworks();
    return;
  }

  const card = state.reviewQueue[idx];
  state.flipped = false;
  state.reviewStartTime = Date.now();

  const scene = document.getElementById('flip-card');
  scene.classList.remove('flipped');

  // Set new/review badge
  const badgeClass = card.isNew ? 'badge-new' : 'badge-review';
  const badgeText = card.isNew ? t('badgeNew') : t('badgeReview');
  const badgeHtml = `<span class="${badgeClass}">${badgeText}</span>`;
  document.getElementById('card-type-badge-front').innerHTML = badgeHtml;
  document.getElementById('card-type-badge-back').innerHTML = badgeHtml;

  // Render content with Markdown
  document.getElementById('card-front-text').innerHTML = renderMarkdown(tCardFront(card.front));
  document.getElementById('card-back-text').innerHTML = renderMarkdown(tCardBack(card.front, card.back));
  document.getElementById('review-controls').classList.remove('visible');
  document.getElementById('flip-hint').style.display = '';
}

function flipCard() {
  if (state.reviewIndex >= state.reviewQueue.length) return;
  state.flipped = !state.flipped;
  document.getElementById('flip-card').classList.toggle('flipped', state.flipped);
  if (state.flipped) {
    document.getElementById('review-controls').classList.add('visible');
    document.getElementById('flip-hint').style.display = 'none';
  }
}

async function submitReview(quality) {
  const card = state.reviewQueue[state.reviewIndex];
  const timeSpentMs = Date.now() - state.reviewStartTime;
  try {
    await apiFetch(`/review/${card.cardId}`, {
      method: 'POST',
      body: JSON.stringify({ quality, timeSpentMs }),
    });
    state.lastReviewedCardId = card.cardId;
  } catch (e) {
    showToast(t('error') + ': ' + e.message);
    state.lastReviewedCardId = null;
  }
  state.reviewIndex++;
  showNextCard();
}

async function undoLastReview() {
  if (!state.lastReviewedCardId) return;
  try {
    await apiFetch(`/review/${state.lastReviewedCardId}/undo`, { method: 'POST' });
    showToast(t('undone'));
    state.reviewIndex--;
    state.lastReviewedCardId = null;
    showNextCard();
  } catch (e) {
    showToast(t('error') + ': ' + e.message);
  }
}

// ── Markdown Rendering ──────────────────────────────────────
function renderMarkdown(text) {
  if (typeof marked !== 'undefined' && typeof DOMPurify !== 'undefined') {
    return DOMPurify.sanitize(marked.parse(text || ''));
  }
  return esc(text || '');
}

// ── Stats View ─────────────────────────────────────────────
let chartReviewTrend = null;
let chartRetentionTrend = null;

async function loadStats() {
  showView('stats-view');
  const s = await apiFetch('/stats');
  const el = id => document.getElementById(id);
  el('stat-total-cards').textContent = s.totalCards;
  el('stat-total-decks').textContent = s.totalDecks;
  el('stat-due-today').textContent = s.dueToday;
  el('stat-reviewed-today').textContent = s.reviewedToday;
  el('stat-total-reviews').textContent = s.totalReviews;
  el('stat-retention').textContent = s.retentionRate.toFixed(1) + '%';
  el('stat-streak').textContent = s.streakDays + ' ' + (s.streakDays !== 1 ? t('days') : t('day'));

  // Load charts
  try {
    const daily = await apiFetch('/stats/daily?days=30');
    renderCharts(daily);
  } catch (e) { /* Chart.js may not be loaded yet */ }
}

function renderCharts(daily) {
  if (typeof Chart === 'undefined') return;
  const labels = daily.map(d => d.date.slice(5)); // MM-DD
  const counts = daily.map(d => d.count);
  const retentions = daily.map(d => d.retentionRate);

  // Destroy old charts
  if (chartReviewTrend) chartReviewTrend.destroy();
  if (chartRetentionTrend) chartRetentionTrend.destroy();

  const commonOptions = {
    responsive: true,
    plugins: { legend: { display: false } },
    scales: {
      x: { grid: { display: false }, ticks: { maxRotation: 45, font: { size: 10 } } },
    },
  };

  // Review count bar chart
  chartReviewTrend = new Chart(document.getElementById('chart-review-trend'), {
    type: 'bar',
    data: {
      labels,
      datasets: [{
        label: t('reviewCount'),
        data: counts,
        backgroundColor: 'rgba(79, 70, 229, 0.6)',
        borderRadius: 4,
      }],
    },
    options: {
      ...commonOptions,
      scales: {
        ...commonOptions.scales,
        y: { beginAtZero: true, ticks: { precision: 0 } },
      },
    },
  });

  // Retention line chart
  chartRetentionTrend = new Chart(document.getElementById('chart-retention-trend'), {
    type: 'line',
    data: {
      labels,
      datasets: [{
        label: t('retention'),
        data: retentions,
        borderColor: '#22c55e',
        backgroundColor: 'rgba(34, 197, 94, 0.1)',
        fill: true,
        tension: 0.3,
        pointRadius: 3,
        pointBackgroundColor: '#22c55e',
      }],
    },
    options: {
      ...commonOptions,
      scales: {
        ...commonOptions.scales,
        y: { beginAtZero: true, max: 100, ticks: { callback: v => v + '%' } },
      },
    },
  });
}

// ── Create Deck Modal ───────────────────────────────────────
function openCreateDeckModal() {
  document.getElementById('deck-form').reset();
  document.getElementById('deck-modal-title').textContent = t('newDeckTitle');
  document.getElementById('deck-id-input').value = '';
  document.getElementById('deck-modal').classList.remove('hidden');
}

function closeDeckModal() {
  document.getElementById('deck-modal').classList.add('hidden');
  state._creatingPool = false;
}

async function editDeck(e, deckId) {
  e.stopPropagation();
  const deck = state.decks.find(d => d.id === deckId);
  if (!deck) return;
  document.getElementById('deck-modal-title').textContent = t('editDeckTitle');
  document.getElementById('deck-name-input').value = deck.name;
  document.getElementById('deck-desc-input').value = deck.description || '';
  document.getElementById('deck-id-input').value = deck.id;
  document.getElementById('deck-modal').classList.remove('hidden');
}

async function saveDeck() {
  const name = document.getElementById('deck-name-input').value.trim();
  const description = document.getElementById('deck-desc-input').value.trim();
  const deckId = document.getElementById('deck-id-input').value;

  if (!name) { showToast(t('nameRequired')); return; }

  try {
    if (deckId) {
      await apiFetch(`/decks/${deckId}`, { method: 'PUT', body: JSON.stringify({ name, description }) });
      showToast(t('deckUpdated'));
    } else if (state._creatingPool) {
      await apiFetch('/decks/pool', { method: 'POST', body: JSON.stringify({ name, description }) });
      showToast(t('deckCreated'));
      state._creatingPool = false;
      closeDeckModal();
      openPoolManage();
      return;
    } else {
      await apiFetch('/decks', { method: 'POST', body: JSON.stringify({ name, description }) });
      showToast(t('deckCreated'));
    }
    closeDeckModal();
    loadDecks();
  } catch (e) {
    showToast(t('error') + ': ' + e.message);
  }
}

async function deleteDeck(e, deckId) {
  e.stopPropagation();
  if (!confirm(t('confirmDeleteDeck'))) return;
  try {
    await apiFetch(`/decks/${deckId}`, { method: 'DELETE' });
    showToast(t('deckDeleted'));
    loadDecks();
  } catch (e) {
    showToast(t('error') + ': ' + e.message);
  }
}

// ── Card CRUD ───────────────────────────────────────────────
function openAddCardModal() {
  document.getElementById('card-form').reset();
  document.getElementById('card-modal-title').textContent = t('addCardTitle');
  document.getElementById('card-id-input').value = '';
  updateCardPreviews();
  document.getElementById('card-modal').classList.remove('hidden');
}

function closeCardModal() {
  document.getElementById('card-modal').classList.add('hidden');
}

function updateCardPreviews() {
  const frontText = document.getElementById('card-front-input').value;
  const backText = document.getElementById('card-back-input').value;
  document.getElementById('card-front-preview').innerHTML = frontText ? renderMarkdown(frontText) : `<span class="md-preview-empty">${t('preview')}</span>`;
  document.getElementById('card-back-preview').innerHTML = backText ? renderMarkdown(backText) : `<span class="md-preview-empty">${t('preview')}</span>`;
}

async function editCard(deckId, cardId) {
  const cards = await apiFetch(`/decks/${deckId}/cards`);
  const card = cards.find(c => c.cardId === cardId);
  if (!card) return;
  document.getElementById('card-modal-title').textContent = t('editCardTitle');
  document.getElementById('card-front-input').value = card.front;
  document.getElementById('card-back-input').value = card.back;
  document.getElementById('card-tags-input').value = card.tags || '';
  document.getElementById('card-id-input').value = cardId;
  updateCardPreviews();
  document.getElementById('card-modal').classList.remove('hidden');
}

async function saveCard() {
  const front = document.getElementById('card-front-input').value.trim();
  const back = document.getElementById('card-back-input').value.trim();
  const tags = document.getElementById('card-tags-input').value.trim();
  const cardId = document.getElementById('card-id-input').value;
  const deckId = state.currentDeck.id;

  if (!front || !back) { showToast(t('frontBackRequired')); return; }

  try {
    if (cardId) {
      await apiFetch(`/decks/${deckId}/cards/${cardId}`, {
        method: 'PUT', body: JSON.stringify({ front, back, tags }),
      });
      showToast(t('cardUpdated'));
    } else {
      await apiFetch(`/decks/${deckId}/cards`, {
        method: 'POST', body: JSON.stringify({ front, back, tags }),
      });
      showToast(t('cardAdded'));
    }
    closeCardModal();
    loadCards(deckId);
  } catch (e) {
    showToast(t('error') + ': ' + e.message);
  }
}

async function deleteCard(deckId, cardId) {
  if (!confirm(t('confirmDeleteCard'))) return;
  try {
    await apiFetch(`/decks/${deckId}/cards/${cardId}`, { method: 'DELETE' });
    showToast(t('cardDeleted'));
    loadCards(deckId);
  } catch (e) {
    showToast(t('error') + ': ' + e.message);
  }
}

// ── Import Modal ────────────────────────────────────────────
function openImportModal() {
  document.getElementById('import-form').reset();
  document.getElementById('import-result').textContent = '';
  // Populate deck selector
  const sel = document.getElementById('import-deck-select');
  sel.innerHTML = state.decks.map(d => `<option value="${d.id}">${esc(tDeckName(d))}</option>`).join('');
  document.getElementById('import-modal').classList.remove('hidden');
}

function closeImportModal() {
  document.getElementById('import-modal').classList.add('hidden');
}

async function submitImport() {
  const deckId = document.getElementById('import-deck-select').value;
  const format = document.getElementById('import-format').value;
  const file = document.getElementById('import-file').files[0];
  if (!file) { showToast(t('selectFile')); return; }

  const formData = new FormData();
  formData.append('file', file);

  try {
    const res = await fetch(`${API}/import/${format}?deckId=${deckId}`, {
      method: 'POST',
      body: formData,
    });
    const result = await res.json();
    document.getElementById('import-result').textContent =
      `✅ Imported: ${result.imported}  ❌ Failed: ${result.failed}`;
    showToast(result.message);
    loadDecks();
  } catch (e) {
    showToast(t('importError') + ': ' + e.message);
  }
}

// ── Settings Modal ──────────────────────────────────────────
async function openSettingsModal() {
  const list = document.getElementById('settings-deck-list');
  list.innerHTML = state.decks.map(d => `
    <div class="settings-deck-row">
      <span class="settings-deck-name">${esc(tDeckName(d))}</span>
      <div class="settings-inputs">
        <label class="settings-input-label">${t('dailyNewLimitLabel')}
          <input type="number" min="0" id="settings-new-limit-${d.id}" value="${d.dailyNewCardLimit || ''}"
                 placeholder="${t('unlimited')}" />
        </label>
        <label class="settings-input-label">${t('dailyLimit')}
          <input type="number" min="0" id="settings-limit-${d.id}" value="${d.dailyReviewLimit || ''}"
                 placeholder="${t('unlimited')}" />
        </label>
      </div>
    </div>`).join('');
  document.getElementById('settings-modal').classList.remove('hidden');

  // Load SRS settings
  try {
    const srs = await apiFetch('/settings/srs');
    document.getElementById('srs-initial-ease').value = srs.initialEaseFactor;
    document.getElementById('srs-min-ease').value = srs.minEaseFactor;
    document.getElementById('srs-first-interval').value = srs.firstInterval;
    document.getElementById('srs-second-interval').value = srs.secondInterval;
  } catch (e) { /* ignore */ }
}

function closeSettingsModal() {
  document.getElementById('settings-modal').classList.add('hidden');
}

function resetSrsDefaults() {
  document.getElementById('srs-initial-ease').value = 2.5;
  document.getElementById('srs-min-ease').value = 1.3;
  document.getElementById('srs-first-interval').value = 1;
  document.getElementById('srs-second-interval').value = 6;
}

async function saveSettings() {
  try {
    // Save deck limits
    for (const d of state.decks) {
      const limitInput = document.getElementById(`settings-limit-${d.id}`);
      const newLimitInput = document.getElementById(`settings-new-limit-${d.id}`);
      const limitVal = limitInput.value.trim();
      const newLimitVal = newLimitInput.value.trim();
      const limit = limitVal && parseInt(limitVal) > 0 ? parseInt(limitVal) : null;
      const newLimit = newLimitVal && parseInt(newLimitVal) > 0 ? parseInt(newLimitVal) : null;
      if (limit !== d.dailyReviewLimit || newLimit !== d.dailyNewCardLimit) {
        await apiFetch(`/decks/${d.id}`, {
          method: 'PUT',
          body: JSON.stringify({ dailyReviewLimit: limit, dailyNewCardLimit: newLimit }),
        });
      }
    }
    // Save SRS settings
    await apiFetch('/settings/srs', {
      method: 'PUT',
      body: JSON.stringify({
        initialEaseFactor: parseFloat(document.getElementById('srs-initial-ease').value),
        minEaseFactor: parseFloat(document.getElementById('srs-min-ease').value),
        firstInterval: parseInt(document.getElementById('srs-first-interval').value),
        secondInterval: parseInt(document.getElementById('srs-second-interval').value),
      }),
    });
    showToast(t('settingsSaved'));
    closeSettingsModal();
    loadDecks();
  } catch (e) {
    showToast(t('error') + ': ' + e.message);
  }
}

// ── Fireworks ───────────────────────────────────────────────
function launchFireworks() {
  const canvas = document.getElementById('fireworks-canvas');
  canvas.style.display = 'block';
  canvas.width = window.innerWidth;
  canvas.height = window.innerHeight;
  const ctx = canvas.getContext('2d');

  const particles = [];
  const colors = ['#6366f1','#f43f5e','#22c55e','#f59e0b','#3b82f6','#ec4899','#14b8a6'];

  // Create burst points
  for (let b = 0; b < 5; b++) {
    const cx = Math.random() * canvas.width * 0.6 + canvas.width * 0.2;
    const cy = Math.random() * canvas.height * 0.4 + canvas.height * 0.1;
    for (let i = 0; i < 36; i++) {
      const angle = (Math.PI * 2 / 36) * i + Math.random() * 0.3;
      const speed = 2 + Math.random() * 4;
      particles.push({
        x: cx, y: cy,
        vx: Math.cos(angle) * speed,
        vy: Math.sin(angle) * speed,
        life: 1,
        decay: 0.01 + Math.random() * 0.015,
        color: colors[Math.floor(Math.random() * colors.length)],
        size: 2 + Math.random() * 3,
      });
    }
  }

  let raf;
  function animate() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    let alive = false;
    for (const p of particles) {
      if (p.life <= 0) continue;
      alive = true;
      p.x += p.vx;
      p.y += p.vy;
      p.vy += 0.04; // gravity
      p.life -= p.decay;
      ctx.globalAlpha = Math.max(0, p.life);
      ctx.fillStyle = p.color;
      ctx.beginPath();
      ctx.arc(p.x, p.y, p.size, 0, Math.PI * 2);
      ctx.fill();
    }
    ctx.globalAlpha = 1;
    if (alive) {
      raf = requestAnimationFrame(animate);
    } else {
      canvas.style.display = 'none';
      ctx.clearRect(0, 0, canvas.width, canvas.height);
    }
  }
  animate();
}

// ── Init ────────────────────────────────────────────────────
function id(s) { return document.getElementById(s); }

document.addEventListener('DOMContentLoaded', async () => {
  // Apply saved language
  setLang(currentLang);

  // Check authentication first
  const authed = await checkAuth();
  if (!authed) return;

  // Navigation
  document.querySelectorAll('nav button[data-view]').forEach(btn => {
    btn.addEventListener('click', () => {
      const view = btn.dataset.view;
      if (view === 'decks-view') loadDecks();
      else if (view === 'review-view') startReview();
      else if (view === 'stats-view') loadStats();
      else if (view === 'practice-view') loadProblems();
    });
  });

  // Keyboard shortcut: Space/Enter to flip, 1-4 to rate
  document.addEventListener('keydown', e => {
    if (id('review-view').classList.contains('active')) {
      if (e.code === 'Space' || e.code === 'Enter') { e.preventDefault(); flipCard(); }
      if (state.flipped) {
        if (e.key === '1') submitReview(1); // Hard
        if (e.key === '2') submitReview(3); // Good
        if (e.key === '3') submitReview(4); // Easy
        if (e.key === '0') submitReview(0); // Again
      }
    }
  });

  // Card editor live Markdown preview
  document.getElementById('card-front-input').addEventListener('input', updateCardPreviews);
  document.getElementById('card-back-input').addEventListener('input', updateCardPreviews);

  loadDecks();
});

// ── Card Pool ────────────────────────────────────────────────
function openPoolModal() {
  document.getElementById('pool-modal').classList.remove('hidden');
}
function closePoolModal() {
  document.getElementById('pool-modal').classList.add('hidden');
}

async function openPoolManage() {
  // Admin: show pool decks + add button
  document.getElementById('pool-modal-title').textContent = t('poolManage');
  document.getElementById('pool-add-btn').style.display = '';
  document.getElementById('pool-add-btn').textContent = t('poolCreate');
  openPoolModal();
  await renderPoolList(true);
}

async function openPoolBrowse() {
  // User: browse pool + copy button
  document.getElementById('pool-modal-title').textContent = t('pool');
  document.getElementById('pool-add-btn').style.display = 'none';
  openPoolModal();
  await renderPoolList(false);
}

async function renderPoolList(isAdmin) {
  const list = document.getElementById('pool-list');
  list.innerHTML = `<p style="color:var(--muted);text-align:center;padding:1rem">${t('loading')}</p>`;
  try {
    const pools = await apiFetch('/decks/pool');
    if (!pools.length) {
      list.innerHTML = `<p style="color:var(--muted);text-align:center;padding:2rem">${t('poolEmpty')}</p>`;
      return;
    }
    list.innerHTML = pools.map(d => `
      <div class="admin-deck-row"${isAdmin ? ` onclick="closePoolModal();openDeck(${d.id})"` : ` style="cursor:default"`}>
        <span style="font-size:1.2rem">📚</span>
        <span class="admin-deck-name">${esc(tDeckName(d))}</span>
        <span class="admin-deck-stat">${d.totalCards} ${t('poolCards')}</span>
        ${isAdmin
          ? `<button class="btn btn-sm btn-danger" onclick="event.stopPropagation();deletePoolDeck(${d.id})" title="${t('del')}">🗑️</button>`
          : `<button class="btn btn-sm btn-primary" onclick="copyPoolDeck(${d.id})">📥 ${t('poolAddBtn')}</button>`
        }
      </div>
    `).join('');
  } catch (e) {
    list.innerHTML = `<p style="color:var(--again);text-align:center">${e.message}</p>`;
  }
}

async function openPoolCreateForm() {
  closePoolModal();
  // Reuse deck modal but create as pool type
  document.getElementById('deck-modal-title').textContent = t('poolCreate');
  document.getElementById('deck-id-input').value = '';
  document.getElementById('deck-name-input').value = '';
  document.getElementById('deck-desc-input').value = '';
  document.getElementById('deck-modal').classList.remove('hidden');
  // Mark as pool creation
  state._creatingPool = true;
}

async function copyPoolDeck(deckId) {
  try {
    await apiFetch(`/decks/pool/${deckId}/copy`, { method: 'POST' });
    showToast(t('poolAdded'));
    closePoolModal();
    loadDecks();
  } catch (e) {
    showToast(t('error') + ': ' + e.message);
  }
}

async function deletePoolDeck(deckId) {
  if (!confirm(t('confirmDeleteDeck'))) return;
  try {
    await apiFetch(`/decks/${deckId}`, { method: 'DELETE' });
    showToast(t('deckDeleted'));
    await renderPoolList(true);
  } catch (e) {
    showToast(t('error') + ': ' + e.message);
  }
}

// ── AI Features ──────────────────────────────────────────────
let aiHintLevel = 0;

async function requestAiHint(level) {
  if (!currentProblem) return;
  const contentEl = document.getElementById('ai-hint-content');
  const moreBtn = document.getElementById('ai-hint-more');
  const pseudoBtn = document.getElementById('ai-hint-pseudo');

  contentEl.style.display = '';
  contentEl.textContent = t('aiHintLoading');

  const userCode = monacoEditor ? monacoEditor.getValue() : '';

  try {
    const res = await apiFetch('/ai/hint', {
      method: 'POST',
      body: JSON.stringify({
        problemDescription: currentProblem.description,
        userCode: userCode,
        level: level
      })
    });
    contentEl.textContent = res.hint;
    aiHintLevel = level;

    // Show progressive buttons
    moreBtn.style.display = level < 2 ? '' : 'none';
    pseudoBtn.style.display = level < 3 ? '' : 'none';
    moreBtn.textContent = t('aiHintLevel2');
    pseudoBtn.textContent = t('aiHintLevel3');
  } catch (e) {
    contentEl.textContent = t('error') + ': ' + e.message;
  }
}

// AI Generate Cards
async function openAiGenModal() {
  document.getElementById('ai-gen-title').textContent = t('aiGenerateTitle');
  document.getElementById('ai-gen-topic-label').textContent = t('aiTopic');
  document.getElementById('ai-gen-topic').placeholder = t('aiTopicPlaceholder');
  document.getElementById('ai-gen-topic').value = '';
  document.getElementById('ai-gen-count').value = 10;
  document.getElementById('ai-gen-status').textContent = '';
  document.getElementById('ai-gen-preview').style.display = 'none';
  document.getElementById('ai-gen-preview').innerHTML = '';
  document.getElementById('ai-gen-btn').textContent = '🤖 ' + t('aiGenerate').replace('AI ', '');
  document.getElementById('ai-gen-btn').disabled = false;
  document.getElementById('ai-gen-btn').onclick = doAiGenerate;

  // Populate deck select
  const select = document.getElementById('ai-gen-deck');
  const decks = state.decks || [];
  const isAdmin = state.currentUser && state.currentUser.role === 'ADMIN';
  let options = '';

  if (isAdmin) {
    // Admin: only pool decks + create new pool deck
    options += `<option value="__new_pool__">➕ ${t('aiNewPoolDeck')}</option>`;
    try {
      const poolDecks = await apiFetch('/decks/pool');
      options += poolDecks.map(d => `<option value="${d.id}">🏪 ${esc(tDeckName(d))}</option>`).join('');
    } catch (e) { /* ignore */ }
  } else {
    // User: own decks + create new
    options += `<option value="__new__">➕ ${t('aiNewDeck')}</option>`;
    options += decks.map(d => `<option value="${d.id}">${esc(tDeckName(d))}</option>`).join('');
  }

  select.innerHTML = options;
  document.getElementById('ai-gen-new-deck-name').style.display = 'none';
  document.getElementById('ai-gen-new-deck-name').placeholder = t('aiNewDeckPlaceholder');

  document.getElementById('ai-gen-modal').classList.remove('hidden');
}

function closeAiGenModal() {
  document.getElementById('ai-gen-modal').classList.add('hidden');
}

let _aiGeneratedCards = null;

async function doAiGenerate() {
  const topic = document.getElementById('ai-gen-topic').value.trim();
  const count = parseInt(document.getElementById('ai-gen-count').value) || 10;
  if (!topic) { showToast(t('nameRequired')); return; }

  const statusEl = document.getElementById('ai-gen-status');
  const previewEl = document.getElementById('ai-gen-preview');
  const btn = document.getElementById('ai-gen-btn');

  statusEl.textContent = t('aiGenerating');
  btn.disabled = true;

  try {
    const cards = await apiFetch('/ai/generate-cards', {
      method: 'POST',
      body: JSON.stringify({ topic, count, language: currentLang })
    });

    _aiGeneratedCards = cards;
    statusEl.textContent = t('aiGenerated', cards.length);

    // Show preview
    previewEl.style.display = '';
    previewEl.innerHTML = cards.map((c, i) => `
      <div style="padding:.4rem 0;border-bottom:1px solid var(--border);font-size:.85rem">
        <strong>${i + 1}.</strong> ${esc(c.front).substring(0, 80)}${c.front.length > 80 ? '...' : ''}
      </div>
    `).join('');

    // Change button to "Add to Deck"
    btn.textContent = '📥 ' + t('aiAddToDeck');
    btn.disabled = false;
    btn.onclick = doAiAddToDeck;
  } catch (e) {
    statusEl.textContent = t('error') + ': ' + e.message;
    btn.disabled = false;
  }
}

function toggleNewDeckInput() {
  const val = document.getElementById('ai-gen-deck').value;
  const show = val === '__new__' || val === '__new_pool__';
  document.getElementById('ai-gen-new-deck-name').style.display = show ? '' : 'none';
}

async function doAiAddToDeck() {
  if (!_aiGeneratedCards || !_aiGeneratedCards.length) return;
  let deckId = document.getElementById('ai-gen-deck').value;

  // Create new deck or pool deck if needed
  if (deckId === '__new__' || deckId === '__new_pool__') {
    const newName = document.getElementById('ai-gen-new-deck-name').value.trim();
    if (!newName) { showToast(t('nameRequired')); return; }
    try {
      const endpoint = deckId === '__new_pool__' ? '/decks/pool' : '/decks';
      const newDeck = await apiFetch(endpoint, {
        method: 'POST',
        body: JSON.stringify({ name: newName, description: '' })
      });
      deckId = newDeck.id;
    } catch (e) {
      showToast(t('error') + ': ' + e.message);
      return;
    }
  }

  const statusEl = document.getElementById('ai-gen-status');
  let added = 0;

  for (const card of _aiGeneratedCards) {
    try {
      await apiFetch(`/decks/${deckId}/cards`, {
        method: 'POST',
        body: JSON.stringify({ front: card.front, back: card.back, tags: card.tags || '' })
      });
      added++;
    } catch (e) { /* skip failed */ }
  }

  showToast(t('aiGenerated', added));
  _aiGeneratedCards = null;
  closeAiGenModal();
  loadDecks();
}

// ── Practice View ────────────────────────────────────────────
let monacoEditor = null;
let monacoReady = false;
let currentProblem = null;

// Initialize Monaco loader
if (typeof require !== 'undefined' && require.config) {
  require.config({ paths: { vs: 'https://cdn.jsdelivr.net/npm/monaco-editor@0.45.0/min/vs' }});
}

function initMonaco(language, value) {
  const container = document.getElementById('monaco-container');
  const lang = language === 'java' ? 'java' : 'python';

  if (monacoEditor) {
    monacoEditor.dispose();
    monacoEditor = null;
  }

  if (monacoReady) {
    monacoEditor = monaco.editor.create(container, {
      value: value,
      language: lang,
      theme: 'vs',
      minimap: { enabled: false },
      fontSize: 14,
      lineNumbers: 'on',
      scrollBeyondLastLine: false,
      automaticLayout: true,
      tabSize: 4,
    });
    return;
  }

  require(['vs/editor/editor.main'], function() {
    monacoReady = true;
    monacoEditor = monaco.editor.create(container, {
      value: value,
      language: lang,
      theme: 'vs',
      minimap: { enabled: false },
      fontSize: 14,
      lineNumbers: 'on',
      scrollBeyondLastLine: false,
      automaticLayout: true,
      tabSize: 4,
    });
  });
}

async function loadProblems() {
  showView('practice-view');
  document.getElementById('practice-list').style.display = '';
  document.getElementById('practice-detail').style.display = 'none';

  // Show add button for admin
  const addBtn = document.getElementById('add-problem-btn');
  if (addBtn) {
    addBtn.style.display = (state.currentUser && state.currentUser.role === 'ADMIN') ? '' : 'none';
  }

  try {
    const problems = await apiFetch('/practice/problems');
    renderProblems(problems);
  } catch (e) {
    showToast(t('error') + ': ' + e.message);
  }
}

function renderProblems(problems) {
  const grid = document.getElementById('problem-grid');
  if (!problems.length) {
    grid.innerHTML = `<div class="empty" style="grid-column:1/-1">
      <div class="empty-icon">💻</div>
      <h3>${t('codeProblems')}</h3>
    </div>`;
    return;
  }
  grid.innerHTML = problems.map(p => {
    const diffClass = p.difficulty === 'Easy' ? 'diff-easy' : p.difficulty === 'Medium' ? 'diff-medium' : 'diff-hard';
    return `
    <div class="problem-card" onclick="openProblem(${p.id})">
      <div style="margin-bottom:.5rem">
        <span class="problem-number">#${p.problemNumber}</span>
        <span class="difficulty-badge ${diffClass}">${p.difficulty}</span>
        ${p.accepted ? '<span class="ac-badge">✓ AC</span>' : ''}
      </div>
      <h3>${esc(p.title)}</h3>
      <div class="problem-tags">${esc(p.tags || '')}</div>
      ${state.currentUser && state.currentUser.role === 'ADMIN' ? `<div class="deck-actions" style="top:.5rem;right:.5rem">
        <button class="btn btn-sm btn-secondary" onclick="event.stopPropagation();openEditProblemModal(${p.id})" title="Edit">✏️</button>
        <button class="btn btn-sm btn-danger" onclick="event.stopPropagation();deleteProblemConfirm(${p.id})" title="Delete">🗑️</button>
      </div>` : ''}
    </div>`;
  }).join('');
}

async function openProblem(problemId) {
  try {
    const problem = await apiFetch(`/practice/problems/${problemId}`);
    currentProblem = problem;

    document.getElementById('practice-list').style.display = 'none';
    document.getElementById('practice-detail').style.display = '';
    document.getElementById('practice-title').textContent = `#${problem.problemNumber} ${problem.title}`;
    document.getElementById('problem-desc').textContent = problem.description;
    document.getElementById('result-panel').style.display = 'none';

    // Hint - static hint + AI hint
    const hintToggle = document.getElementById('hint-toggle-btn');
    const hintContent = document.getElementById('hint-content');
    const aiHintContent = document.getElementById('ai-hint-content');
    const aiMoreBtn = document.getElementById('ai-hint-more');
    const aiPseudoBtn = document.getElementById('ai-hint-pseudo');
    aiHintContent.style.display = 'none';
    aiMoreBtn.style.display = 'none';
    aiPseudoBtn.style.display = 'none';
    aiHintLevel = 0;
    if (problem.hint && problem.hint.trim()) {
      hintToggle.style.display = '';
      hintContent.textContent = problem.hint;
      hintContent.style.display = 'none';
    } else {
      hintToggle.style.display = 'none';
      hintContent.style.display = 'none';
    }

    const lang = document.getElementById('lang-select').value;
    const template = lang === 'java' ? problem.javaTemplate : problem.pythonTemplate;
    initMonaco(lang, template);

    loadSubmissions(problemId);
  } catch (e) {
    showToast(t('error') + ': ' + e.message);
  }
}

function toggleHint() {
  const el = document.getElementById('hint-content');
  el.style.display = el.style.display === 'none' ? '' : 'none';
}

function backToProblems() {
  if (monacoEditor) { monacoEditor.dispose(); monacoEditor = null; }
  currentProblem = null;
  loadProblems();
}

function switchLanguage() {
  if (!currentProblem) return;
  const lang = document.getElementById('lang-select').value;
  const template = lang === 'java' ? currentProblem.javaTemplate : currentProblem.pythonTemplate;
  initMonaco(lang, template);
}

// ── Problem CRUD (admin) ─────────────────────────────────────
function openCreateProblemModal() {
  document.getElementById('problem-modal-title').textContent = t('addProblem');
  document.getElementById('problem-edit-id').value = '';
  document.getElementById('prob-number').value = '';
  document.getElementById('prob-title').value = '';
  document.getElementById('prob-difficulty').value = 'Easy';
  document.getElementById('prob-tags').value = '';
  document.getElementById('prob-desc').value = '';
  document.getElementById('prob-hint').value = '';
  document.getElementById('prob-java-tpl').value = '';
  document.getElementById('prob-python-tpl').value = '';
  document.getElementById('prob-java-driver').value = '';
  document.getElementById('prob-python-driver').value = '';
  document.getElementById('prob-testcases').value = '';
  document.getElementById('problem-modal').classList.remove('hidden');
}

async function openEditProblemModal(problemId) {
  try {
    const p = await apiFetch(`/practice/problems/${problemId}`);
    document.getElementById('problem-modal-title').textContent = t('editProblem');
    document.getElementById('problem-edit-id').value = p.id;
    document.getElementById('prob-number').value = p.problemNumber;
    document.getElementById('prob-title').value = p.title;
    document.getElementById('prob-difficulty').value = p.difficulty;
    document.getElementById('prob-tags').value = p.tags || '';
    document.getElementById('prob-desc').value = p.description || '';
    document.getElementById('prob-hint').value = p.hint || '';
    document.getElementById('prob-java-tpl').value = p.javaTemplate || '';
    document.getElementById('prob-python-tpl').value = p.pythonTemplate || '';
    document.getElementById('prob-java-driver').value = p.javaDriverCode || '';
    document.getElementById('prob-python-driver').value = p.pythonDriverCode || '';
    document.getElementById('prob-testcases').value = p.testCasesJson || '';
    document.getElementById('problem-modal').classList.remove('hidden');
  } catch (e) {
    showToast(t('error') + ': ' + e.message);
  }
}

function closeProblemModal() {
  document.getElementById('problem-modal').classList.add('hidden');
}

async function saveProblem() {
  const id = document.getElementById('problem-edit-id').value;
  const data = {
    problemNumber: parseInt(document.getElementById('prob-number').value) || null,
    title: document.getElementById('prob-title').value.trim(),
    difficulty: document.getElementById('prob-difficulty').value,
    tags: document.getElementById('prob-tags').value.trim(),
    description: document.getElementById('prob-desc').value.trim(),
    hint: document.getElementById('prob-hint').value.trim() || null,
    javaTemplate: document.getElementById('prob-java-tpl').value || '',
    pythonTemplate: document.getElementById('prob-python-tpl').value || '',
    javaDriverCode: document.getElementById('prob-java-driver').value || '',
    pythonDriverCode: document.getElementById('prob-python-driver').value || '',
    testCasesJson: document.getElementById('prob-testcases').value || '[]',
  };
  if (!data.title || !data.problemNumber) {
    showToast(t('nameRequired'));
    return;
  }
  try {
    if (id) {
      await apiFetch(`/practice/problems/${id}`, { method: 'PUT', body: JSON.stringify(data) });
    } else {
      await apiFetch('/practice/problems', { method: 'POST', body: JSON.stringify(data) });
    }
    showToast(id ? t('deckUpdated') : t('deckCreated'));
    closeProblemModal();
    loadProblems();
  } catch (e) {
    showToast(t('error') + ': ' + e.message);
  }
}

async function deleteProblemConfirm(problemId) {
  if (!confirm(t('confirmDeleteDeck'))) return;
  try {
    await apiFetch(`/practice/problems/${problemId}`, { method: 'DELETE' });
    showToast(t('deckDeleted'));
    loadProblems();
  } catch (e) {
    showToast(t('error') + ': ' + e.message);
  }
}

async function submitCode() {
  if (!currentProblem || !monacoEditor) return;

  const code = monacoEditor.getValue();
  const language = document.getElementById('lang-select').value;
  const btn = document.getElementById('run-btn');

  btn.textContent = t('running');
  btn.classList.add('btn-loading');

  try {
    const result = await apiFetch(`/practice/problems/${currentProblem.id}/submit`, {
      method: 'POST',
      body: JSON.stringify({ language, code }),
    });

    renderResult(result);
    loadSubmissions(currentProblem.id);
  } catch (e) {
    showToast(t('error') + ': ' + e.message);
  } finally {
    btn.textContent = t('runCode');
    btn.classList.remove('btn-loading');
  }
}

function renderResult(result) {
  const panel = document.getElementById('result-panel');
  panel.style.display = '';

  const header = document.getElementById('result-header');
  const statusClass = result.status === 'ACCEPTED' ? 'result-accepted' :
    result.status === 'WRONG_ANSWER' ? 'result-wrong' : 'result-error';
  header.innerHTML = `<span class="${statusClass}">${result.status}</span> — ${result.passedCases}/${result.totalCases} passed`;

  const casesDiv = document.getElementById('result-cases');
  casesDiv.innerHTML = result.testCases.map(tc => {
    const cls = tc.passed ? 'case-pass' : 'case-fail';
    const icon = tc.passed ? '✓' : '✗';
    return `
    <div class="result-case">
      <span class="${cls}">${icon} Case ${tc.index}</span>
      ${!tc.passed ? `<div class="case-detail">Input: ${esc(tc.input)}\nExpected: ${esc(tc.expectedOutput)}\nActual: ${esc(tc.actualOutput)}</div>` : ''}
    </div>`;
  }).join('');
}

async function loadSubmissions(problemId) {
  try {
    const subs = await apiFetch(`/practice/problems/${problemId}/submissions`);
    const tbody = document.getElementById('submission-tbody');
    if (!subs.length) {
      tbody.innerHTML = `<tr><td colspan="4" style="text-align:center;padding:1rem;color:var(--muted)">${t('noSubmissions')}</td></tr>`;
      return;
    }
    tbody.innerHTML = subs.map(s => {
      const statusCls = 'status-' + s.status.toLowerCase();
      const dt = new Date(s.submittedAt);
      const timeStr = dt.toLocaleTimeString([], { hour: '2-digit', minute: '2-digit' });
      return `<tr>
        <td>${esc(s.language)}</td>
        <td class="${statusCls}">${s.status}</td>
        <td>${s.passedCases}/${s.totalCases}</td>
        <td>${timeStr}</td>
      </tr>`;
    }).join('');
  } catch (e) {
    // silent — non-critical
  }
}
